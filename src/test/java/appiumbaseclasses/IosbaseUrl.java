package appiumbaseclasses;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class IosbaseUrl {

    public static IOSDriver<MobileElement> driver;
    @Test
    public static IOSDriver getIOSDriver() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "IOS");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("app", "/Users/mustafababadagi/IosApplications/MyRNDemoApp.app");
//        caps.setCapability("app", "/Users/mustafababadagi/Library/Developer/Xcode/DerivedData/TheApp-ewedjfshyezluqhkekvpcqgsylry/Build/Products/Debug-iphonesimulator/TheApp.app");

        caps.setCapability("deviceName", "iPhone 14 Pro");
        caps.setCapability("platformVersion", "16.4");

        driver = new IOSDriver <>(new URL("http://localhost:4723/wd/hub"), caps);

        return driver;
    }


}
