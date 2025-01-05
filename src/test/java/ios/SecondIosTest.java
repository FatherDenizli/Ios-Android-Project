package ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class SecondIosTest {

    public static IOSDriver<MobileElement> driver;

//    private static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723";

    @BeforeTest
    public void setup() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "IOS");
        dc.setCapability("automationName", "XCUITest");
        dc.setCapability("app", "/Users/mustafababadagi/Library/Developer/Xcode/DerivedData/TheApp-ewedjfshyezluqhkekvpcqgsylry/Build/Products/Debug-iphonesimulator/TheApp.app");
        dc.setCapability("deviceName", "iPhone 14 Pro");
        dc.setCapability("platformVersion", "16.4");

         driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void simpleAlert() {

//        driver.findElementByAccessibilityId("Alert Views").click();
        System.out.println("Mustafa");

    }
}