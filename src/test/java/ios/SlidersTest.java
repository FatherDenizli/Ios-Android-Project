package ios;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static appiumbaseclasses.IosbaseUrl.driver;
import static appiumbaseclasses.IosbaseUrl.getIOSDriver;

public class SlidersTest {




        @BeforeTest
        public void setUp () throws MalformedURLException {

            IOSDriver driver = getIOSDriver();

        }

    @Test
    public void sliderTest () throws InterruptedException {

        driver.findElementByAccessibilityId("Sliders").click();
//        IOSElement slider=(IOSElement)driver
        IOSElement slider=(IOSElement)driver.findElementByXPath("//XCUIElementTypeSlider[@value='42%']");



        slider.setValue("80%");
        Thread.sleep(5000);
//        slider.setValue("80%");




    }

}
