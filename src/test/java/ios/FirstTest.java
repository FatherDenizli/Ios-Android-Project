package ios;

import appiumbaseclasses.IosbaseUrl;
import io.appium.java_client.ios.IOSDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static appiumbaseclasses.IosbaseUrl.driver;


public class FirstTest {


//    private static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723";

    @BeforeTest
    public void setup() throws MalformedURLException {

//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setCapability("platformName", "IOS");
//        dc.setCapability("automationName", "XCUITest");
//        dc.setCapability("app", "/Users/mustafababadagi/Desktop/UIKitCatalog.app");
//        dc.setCapability("deviceName", "iPhone 14 Pro");
//        dc.setCapability("platformVersion", "16.4");
//
//        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
//    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        IOSDriver driver= IosbaseUrl.getIOSDriver();

    }

    @Test
    public void simpleAlert() {

        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByAccessibilityId("Text Entry").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Horizontal scroll bar, 1 page'])[2]").sendKeys("Mustafa");
        driver.findElementByAccessibilityId("OK").click();
        driver.findElementByAccessibilityId("Confirm / Cancel").click();
        String textConfirmMessage=driver.findElementByXPath("//*[contains(@name,'message')]").getText();
        System.out.println(textConfirmMessage);
        driver.findElementByAccessibilityId("Confirm").click();
        Assert.assertEquals(textConfirmMessage,"A message should be a short, complete sentence.");
        driver.findElementByXPath("//XCUIElementTypeButton[@name='UIKitCatalog']").click();

        driver.findElementByAccessibilityId("Page Control").click();

        Assert.assertTrue(driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Page Control']").isDisplayed());

        driver.findElementByAccessibilityId("Page Control").click();

         driver.findElementByXPath("//XCUIElementTypeButton[@name='UIKitCatalog']").click();

        System.out.println("Mustafa");



    }
}