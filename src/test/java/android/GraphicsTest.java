package android;

import appiumbaseclasses.AndroidbaseUrl;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static appiumbaseclasses.AndroidbaseUrl.androidDriver;

public class GraphicsTest {

    @BeforeTest
    public void setUp() throws MalformedURLException {

        AndroidDriver<MobileElement> androidDriver = AndroidbaseUrl.getAndroidDriver();

    }

    @Test
    public void contentTest() throws InterruptedException {

        androidDriver.findElementByAccessibilityId("App").click();
//        androidDriver.findElementByAccessibilityId("BitmapMesh").click();
        Thread.sleep(2000);
        androidDriver.findElementByAccessibilityId("Alarm").click();
        Thread.sleep(2000);
         androidDriver.findElementByXPath("//android.widget.TextView[@content-desc='Alarm Controller']").click();

        Assert.assertTrue(androidDriver.findElementByAccessibilityId("Stop Repeating Alarm").isDisplayed());


    }
    }



