package ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Ipa2 {

    public static IOSDriver<MobileElement> driver;
// https://www.diawi.com/
//    https://www.youtube.com/watch?v=bQxtzKBcKn8
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
//        File appDir = new File("//Users//gangaiahl//Appium//jars");
//        File app = new File(appDir, "Car.ipa");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
        capabilities.setCapability("device", "iPhone 14 Pro");
        capabilities.setCapability("udid", "E066929C-CEA1-4028-98B3-2A2213E4D1D1");
        capabilities.setCapability("bundle_id", "io.cloudgrey.the-app");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "16.4");
        capabilities.setCapability("app", "/Users/mustafababadagi/IosApplications/TheApp-v1.10.0.ipa");

        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test
    public void test() {
        System.out.println("Test started");
        //System.out.println(" Start to identify a test");
        //System.out.println("Test Completed");
    }

}