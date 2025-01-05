package appiumbaseclasses;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class generalStorebaseUrl {

    public static AndroidDriver<MobileElement> storeDriver ;

    @Test
    public static AndroidDriver getAndroidDriver() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2 API 28");

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");


        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");
        cap.setCapability(MobileCapabilityType.APP,"/Users/mustafababadagi/Ios-Android Applications/apkfiles/General-Store.apk");

//        cap.setCapability("appPackage", "com.davemac327.gesture.tool");
//        cap.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");

        cap.setCapability(MobileCapabilityType.NO_RESET,true);

        storeDriver=new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"),cap);


            return storeDriver;
    }


}
