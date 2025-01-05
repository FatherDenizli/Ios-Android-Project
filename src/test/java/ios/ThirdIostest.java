package ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

    public class ThirdIostest {
        public static void main(String[] args) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "iOS");
            caps.setCapability("deviceName", "iPhone 14 Pro");
            caps.setCapability("app", "/Users/mustafababadagi/Desktop/UIKitCatalog.app");
            caps.setCapability("deviceVersion", "16.4");



            try {
                IOSDriver<MobileElement> driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
                System.out.println("Mustafa");
                // Your test code here
//                driver.quit();
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
