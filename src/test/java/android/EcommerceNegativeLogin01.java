package android;

import appiumbaseclasses.generalStorebaseUrl;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class EcommerceNegativeLogin01 extends generalStorebaseUrl{
/*add*/

    @BeforeTest
    public void setUp() throws MalformedURLException {


        AndroidDriver<MobileElement> storeDriver= generalStorebaseUrl.getAndroidDriver();

    }


    @Test
    public void negativeTest() throws MalformedURLException, InterruptedException {


        //1- Fill the form details and verify Toast error messages displayed appropriately for wrong inputs
        //1- hatali data ile form doldurdugunuzda hata mesajini dogrulayin


        //MobileElement countrySpinner = driver.findElementById("android:id/text1");


//        MobileElement homeScreenTitle = driver.findElementById("toolbar_title");
//        MobileElement countrySpinner = driver.findElementById("spinnerCountry");

//         MobileElement homeScreenTitle = storeDriver.findElementById("com.androidsample.generalstore:id/toolbar_title");
//        Thread.sleep(3000);
        Thread.sleep(3000);
        MobileElement countrySpinner = storeDriver.findElementByXPath("//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']");


//        Assert.assertEquals("General Store", homeScreenTitle.getText());
//        System.out.println(homeScreenTitle.getText());

        MobileElement nameBox = storeDriver.findElementById("com.androidsample.generalstore:id/nameField");
        MobileElement maleRadioButton = storeDriver.findElementById("com.androidsample.generalstore:id/radioMale");
        MobileElement femaleRadioButton = storeDriver.findElementById("com.androidsample.generalstore:id/radioFemale");
        MobileElement letsShopButton = storeDriver.findElementById("com.androidsample.generalstore:id/btnLetsShop");

//ana sayfa da miyiz? onayladik

        //ulkeyi secmek icin ulke butununa bastik
        countrySpinner.click();

            storeDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"))");
            storeDriver.findElementByXPath("//android.widget.TextView[@text='Angola']").click();

        //istedigimiz ulkeyi dogru olarak sectik mi?
        String selectedCountry=storeDriver.findElementByXPath("//android.widget.TextView[@text='Angola']").getText();
        System.out.println(storeDriver.findElementByXPath("//android.widget.TextView[@text='Angola']").getText());
        Assert.assertEquals("Angola" ,selectedCountry );
        Thread.sleep(3000);

        // nameBox should be free for negative case
        nameBox.sendKeys("Ali");
 //     Assert.assertTrue(nameBox.getText().isEmpty());

        nameBox.clear();

// femaleRadioButton should be selected
        femaleRadioButton.click();
        // click shopButton
        letsShopButton.click();
        Thread.sleep(3000);


        // Verify errror message

//        MobileElement errorPopUpText = driver.findElementByXPath("//android.widget.Toast[@text='Please enter your name']");
//        String errorText = errorPopUpText.getText();
//        Assert.assertEquals(errorText, "Please enter your name");

        //close app
//            storeDriver.closeApp();



    }

}
