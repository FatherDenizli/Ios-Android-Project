package ios;

import appiumbaseclasses.IosbaseUrl;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

import static appiumbaseclasses.IosbaseUrl.driver;

public class DataPickerTest {

    @BeforeTest
    public void setup() throws MalformedURLException {

        IOSDriver driver= IosbaseUrl.getIOSDriver();

    }

    @Test
    public void dataPickerTest() throws InterruptedException {
        System.out.println("Mustafa");
        driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Date Picker']").click();

//         List<MobileElement> dateValues = driver.findElements(By.id("//XCUIElementTypeButton"));

        driver.findElementByXPath("//XCUIElementTypeButton[@name='Jan 3, 2025']").click();
        Thread.sleep(200);

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();",  driver.findElementByXPath("//XCUIElementTypeImage[@name=\"Forward\"]"));

//        IOSElement element = (IOSElement) driver.findElementByIosNsPredicate("name =='Forward'");
//        element.click();
//        IOSElement element = (IOSElement) driver.
//                findElementByIosClassChain("**/XCUIElementTypeImage[`name == 'Forward' && type=='XCUIElementTypeImage'`]");
//        element.click();

          driver.findElementByXPath("//XCUIElementTypeStaticText[@name='January 2025']").click();

//        driver.findElementById("Forward").click();
          Thread.sleep(2000);

        //XCUIElementTypeImage[@name="Forward"]
        //XCUIElementTypeStaticText[@name="January 2025"]

         List<MobileElement> datepickers = driver.findElements(By.id("//XCUIElementTypePickerWheel"));

        System.out.println(datepickers.size());
        datepickers.get(0).sendKeys("October");
        datepickers.get(1).sendKeys("1964");

        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"7:52 PM\"]").click();
        List<MobileElement> timepickers = driver.findElements(By.id("//XCUIElementTypePickerWheel"));
        timepickers.get(0).sendKeys("11");
        timepickers.get(0).sendKeys("27");

        timepickers.get(0).sendKeys("AM");

    }

}
