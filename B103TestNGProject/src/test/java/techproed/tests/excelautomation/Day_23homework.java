package techproed.tests.smoketests;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
public class Day_23homework {
    //Name:
//US101122_Negative_Login
//Description:
//Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
//Acceptance Criteria:
//Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
//Error Message: email must be a valid email
//Dogru email uzantisi girildiğinde hata mesajı alınmamalı
//https://email-verify.my-addr.com/list-of-most-popular-email-domains.php

    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    @Test
    public void US101122_Negative_Login() throws InterruptedException {
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage.loginLink.click();
        Thread.sleep(2000);
        blueRentalLoginPage.emailBox.sendKeys("jack");
        Assert.assertTrue(blueRentalLoginPage.false_Mail_Massage.isDisplayed());
        Thread.sleep(2000);
        // Driver.closeDriver();
    }
    //Dogru email uzantisi girildiğinde hata mesajı alınmamalı
    @Test
    public void testDogruEmailUzantisi() throws InterruptedException {
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys("hava.ozbay@hotmail.com");
        Thread.sleep(2000);
        Assert.assertFalse(blueRentalLoginPage.false_Mail_Massage.isDisplayed());
    }
}