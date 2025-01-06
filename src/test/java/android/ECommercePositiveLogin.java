package android;

import appiumbaseclasses.generalStorebaseUrl;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ECommercePositiveLogin extends generalStorebaseUrl {


    @BeforeTest
    public void setUp() throws MalformedURLException {


        AndroidDriver<MobileElement> storeDriver= generalStorebaseUrl.getAndroidDriver();

    }
    @Test
    public void PositiveTest() throws InterruptedException {


         //1- Fill the form details and verify Toast error messages displayed appropriately for wrong inputs

//        MobileElement homeScreenTitle = storeDriver.findElementByXPath("//*[text()='General Store']");
        Thread.sleep(5000);
        MobileElement countrySpinner = storeDriver.
                findElementByXPath("//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']");

//android.widget.TextView[@resource-id="android:id/text1"]
        MobileElement nameBox = storeDriver.findElementById("com.androidsample.generalstore:id/nameField");
        MobileElement maleRadioButton = storeDriver.findElementById("com.androidsample.generalstore:id/radioMale");
        MobileElement femaleRadioButton = storeDriver.findElementById("com.androidsample.generalstore:id/radioFemale");
        MobileElement letsShopButton = storeDriver.findElementById("com.androidsample.generalstore:id/btnLetsShop");


        //click country spinner
        countrySpinner.click();
        //country selected


        Thread.sleep(3000);

        String country = "Japan";
        MobileElement element = (MobileElement) storeDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text('" + country + "'))"));

        element.click();

//        MobileElement expectedCountry = storeDriver.findElementByXPath("//android.widget.TextView[@text='Japan']");
//        expectedCountry.click();
//        Thread.sleep(5000);

        MobileElement selectedCountry = storeDriver.findElementByXPath("//android.widget.TextView[@text='Japan']");
        System.out.println(selectedCountry.getText());
        Assert.assertEquals(selectedCountry.getText(), "Japan");
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
