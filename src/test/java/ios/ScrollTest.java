package ios;

import appiumbaseclasses.IosbaseUrl;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.HashMap;

import static appiumbaseclasses.IosbaseUrl.driver;

public class ScrollTest {
    public static HashMap<String,Object> scrollObject;
    @BeforeTest
    public void setUp() throws MalformedURLException {

        IOSDriver driver= IosbaseUrl.getIOSDriver();


    }

    @Test
    public void scrollTest() throws InterruptedException {
        System.out.println("----------");

        //scroll swipe        there are no appium methods available for these/ javascript is used

        scroll:
        scrollObject=new HashMap<>();
        scrollObject.put("direction","down");
        scrollObject.put("name","Web View");

        driver.executeScript("mobile:scroll",scrollObject );
        driver.findElementByAccessibilityId("Web View").click();

        Thread.sleep(3000);
        driver.findElementByXPath("//XCUIElementTypeButton[@name='UIKitCatalog']").click();
        Thread.sleep(3000);
         //*[ contains (text(), ‘Get started’ ) ]
        //go up
        scrollObject=new HashMap<>();
        scrollObject.put("direction","up");
        scrollObject.put("name","Alert Views");

        driver.executeScript("mobile:scroll", scrollObject);
        driver.findElementByXPath("//*[@name='Alert Views']").click();

        System.out.println("----------");

    }

}
