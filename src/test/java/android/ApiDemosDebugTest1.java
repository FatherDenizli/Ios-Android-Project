package android;

import appiumbaseclasses.AndroidbaseUrl;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static appiumbaseclasses.AndroidbaseUrl.androidDriver;


public class ApiDemosDebugTest1 {

    @BeforeTest
    public void setUp() throws MalformedURLException {


        AndroidDriver<MobileElement> androidDriver= AndroidbaseUrl.getAndroidDriver();

    }
    @Test
    public void contentTest(){


      androidDriver.findElementByAccessibilityId("Content").click();androidDriver.findElementByXPath("//android.widget.TextView[@content-desc='Resources']").click();androidDriver.findElementByXPath("//android.widget.TextView[@content-desc='Styled Text']").click();
      Assert.assertTrue(androidDriver.findElementByAccessibilityId("Plain, bold, italic, bold-italic").isDisplayed());
      Assert.assertTrue(androidDriver.findElementById("io.appium.android.apis:id/text").isDisplayed());
    }

}
