package ios;

import io.appium.java_client.ios.IOSDriver;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Ipa1 {

    public static IOSDriver driver;


    // https://www.diawi.com/
//    https://www.youtube.com/watch?v=bQxtzKBcKn8
    // https://www.youtube.com/watch?v=2c_zTSLIgFM
//    https://www.installonair.com/
    // https://medium.com/@itskaranzzz/how-to-install-ipa-file-directly-to-iphones-tabs-without-using-laptop-desktop-e645c36125d2

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        File appDir = new File("//Users//gangaiahl//Appium//jars");
        File app = new File(appDir, "Car.ipa");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "firefox");
        capabilities.setCapability("device", "iPhone 6");
        capabilities.setCapability("u_did", "840384833537f40d011032eaaf20a53705a451ce");
        capabilities.setCapability("bundle_id", "au.dev.com.onewaytraffic.carsguide");
        capabilities.setCapability("deviceName", "Cars_iPhone_6");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "9.2");
        capabilities.setCapability("app", app.getAbsolutePath());

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test
    public void test() {
        System.out.println("Test started");
        //System.out.println(" Start to identify a test");
        //System.out.println("Test Completed");
    }

}