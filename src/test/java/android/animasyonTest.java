package android;

import appiumbaseclasses.AndroidbaseUrl;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static appiumbaseclasses.AndroidbaseUrl.androidDriver;

public class animasyonTest {

        @BeforeTest
        public void setUp() throws MalformedURLException {

            AndroidDriver<MobileElement> androidDriver = AndroidbaseUrl.getAndroidDriver();

        }

        @Test
        public void contentTest() {
            System.out.println("hhhhhhhhh");
            androidDriver.findElementByAccessibilityId("Animation").click();
            androidDriver.findElementByAccessibilityId("Bouncing Balls").click();

           MobileElement balls= androidDriver.findElementByXPath("//android.view.View");

           for (int i=0; i<=10;i++){

               balls.click();
           }

        }

}
