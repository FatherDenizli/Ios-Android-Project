package ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

import static appiumbaseclasses.IosbaseUrl.driver;
import static appiumbaseclasses.IosbaseUrl.getIOSDriver;

public class PickerTest2 {

    @BeforeTest
    public void setup() throws MalformedURLException {


        IOSDriver driver= getIOSDriver();

    }

    @Test

    public void PickerListTest(){

        System.out.println("----------------------------");

        driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Picker View']").click();

        List<MobileElement> values=driver.findElementsByXPath("//XCUIElementTypePickerWheel");

        String val1=values.get(0).getAttribute("value");
        String val2=values.get(1).getText();
        String val3=values.get(2).getAttribute("value");

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);

        values.get(0).sendKeys("70");
        values.get(1).sendKeys("151");
        values.get(2).sendKeys("87");


    }

}
