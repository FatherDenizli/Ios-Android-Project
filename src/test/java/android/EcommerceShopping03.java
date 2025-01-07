package android;
import appiumbaseclasses.GeneralStorebaseUrl;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class EcommerceShopping03 extends GeneralStorebaseUrl {

    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {

         AndroidDriver<MobileElement> storeDriver= GeneralStorebaseUrl.getAndroidDriver();
        Thread.sleep(3000);
    }


    @Test
    public void test() throws MalformedURLException, InterruptedException {



//        MobileElement homeScreenTitle = storeDriver.findElementById("toolbar_title");
        MobileElement countrySpinner = storeDriver.
                findElementByXPath("//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']");


//        System.out.println(homeScreenTitle.getText());
        System.out.println(countrySpinner.getText());


        MobileElement nameBox = storeDriver.findElementById("com.androidsample.generalstore:id/nameField");
        MobileElement maleRadioButton = storeDriver.findElementById("com.androidsample.generalstore:id/radioMale");
        MobileElement femaleRadioButton = storeDriver.findElementById("com.androidsample.generalstore:id/radioFemale");
        MobileElement letsShopButton = storeDriver.findElementById("com.androidsample.generalstore:id/btnLetsShop");


        countrySpinner.click();

        storeDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"))");

        MobileElement expectedCountry = storeDriver.findElementByXPath("//android.widget.TextView[@text='Brazil']");
        Assert.assertEquals(expectedCountry.getText(),"Brazil");
        Thread.sleep(3000);
        expectedCountry.click();



        nameBox.sendKeys("Mavi");

        femaleRadioButton.click();

        letsShopButton.click();

        storeDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Jordan Lift Off\"));")).click();;
        TimeUnit.SECONDS.sleep(1);
        MobileElement addToCart1 = storeDriver.findElementByXPath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[2]");
        addToCart1.click();

        storeDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"PG 3\"));")).click();;
        TimeUnit.SECONDS.sleep(1);
        MobileElement addToCart2 = storeDriver.findElementByXPath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]");
        addToCart2.click();









//         storeDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text('LeBron Soldier 12'))");
        TimeUnit.SECONDS.sleep(3);
//        MobileElement addToCart2 = storeDriver.findElementByXPath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]");
//        addToCart2.click();
//         storeDriver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
//          Assert.assertTrue(storeDriver.findElementById("com.androidsample.generalstore:id/toolbar_title").isDisplayed());
//         //   First product name Air Jordan 4 Retro
//        Assert.assertEquals(storeDriver.findElementByXPath("//android.widget.TextView[@text='Nike Blazer Mid '77']").getText(),"Nike Blazer Mid '77");

        //   Second product name Converse All Star
        storeDriver.findElementByXPath("//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_cart\"]").click();
        //android.widget.TextView[@resource-id="com.androidsample.generalstore:id/productName"]
        Assert.assertEquals(storeDriver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\" and @text=\"Jordan Lift Off\"]").getText(),"Jordan Lift Off");
        Assert.assertEquals(storeDriver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\" and @text=\"PG 3\"]").getText(),"PG 3");

        Thread.sleep(5000);
        //Close app
//        storeDriver.closeApp();




    }



    }
