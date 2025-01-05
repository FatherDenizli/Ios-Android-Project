package ios;

import appiumbaseclasses.IosbaseUrl;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static appiumbaseclasses.IosbaseUrl.driver;

public class PickerTest1 {



    @BeforeTest
    public void setup() throws MalformedURLException {


        IOSDriver driver= IosbaseUrl.getIOSDriver();


    }

    @Test
    public void IOsPickerTest() throws InterruptedException {

        System.out.println("--------------");
        driver.findElementById("Picker View").click();
        driver.findElementByAccessibilityId("Red color component value").sendKeys("80");
        Thread.sleep(50);
        driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
        Thread.sleep(50);
        driver.findElementByAccessibilityId("Blue color component value").sendKeys("105");
        Thread.sleep(50);
        String  blueValue=driver.findElementByAccessibilityId("Blue color component value").getText();
        System.out.println(blueValue);







    }









}
