package android;

import appiumbaseclasses.generalStorebaseUrl;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ECommercePositiveLogin extends generalStorebaseUrl {
    /*
    //1- Fill the form details and verify Toast error messages displayed appropriately for wrong inputs
    //1- hatali data ile form doldurdugunuzda hata mesajini dogrulayin
//2-git  the items in the app by scrolling to specific Product and add to cart
//3-Validate if the items selected in the page 2 are matching with the items displayed in check out page
//4- Validate the total Amount displayed in the checkout page matches with sum of product
amounts selected for shopping
//5-Validate Mobile gestures working for link (long press) and navigate to WebView //6-Verify if user can do
 operations on Web view and navigate back to native app if needed.
(go to google and search “appium” then navigate to NATIVE APP and verify it)

     */

    @BeforeTest
    public void setUp() throws MalformedURLException {


        AndroidDriver<MobileElement> storeDriver= generalStorebaseUrl.getAndroidDriver();

    }
    @Test
    public void PositiveTest() throws InterruptedException {


         //1- Fill the form details and verify Toast error messages displayed appropriately for wrong inputs

//        MobileElement homeScreenTitle = storeDriver.findElementByXPath("//*[text()='General Store']");
        Thread.sleep(5000);
        MobileElement countrySpinner = storeDriver.findElementByXPath("//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']");

//android.widget.TextView[@resource-id="android:id/text1"]
        MobileElement nameBox = storeDriver.findElementById("com.androidsample.generalstore:id/nameField");
        MobileElement maleRadioButton = storeDriver.findElementById("com.androidsample.generalstore:id/radioMale");
        MobileElement femaleRadioButton = storeDriver.findElementById("com.androidsample.generalstore:id/radioFemale");
        MobileElement letsShopButton = storeDriver.findElementById("com.androidsample.generalstore:id/btnLetsShop");


        //click country spinner
        countrySpinner.click();
        //country selected
        Thread.sleep(4000);
        storeDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text('Ireland'))");
        MobileElement expectedCountry = storeDriver.findElementByXPath("//android.widget.TextView[@text='Ireland']");
        expectedCountry.click();
        Thread.sleep(5000);

        MobileElement selectedCountry = storeDriver.findElementByXPath("//android.widget.TextView[@text='Ireland']");
        System.out.println(selectedCountry.getText());
        Assert.assertEquals(selectedCountry.getText(), "Ireland");
        Thread.sleep(3000);

        //fill other boc and check
        nameBox.sendKeys("Blue");
        //male selected
        maleRadioButton.click();
        //click shop button
        letsShopButton.click();

//        //close app
        storeDriver.closeApp();

    }
}
