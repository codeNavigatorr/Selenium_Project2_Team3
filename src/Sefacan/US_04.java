package Sefacan;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US_04 extends BaseDriver {

    @Test
    public void test1()
    {
        driver.get("https://demowebshop.tricentis.com/);//siteye git");
        MyFunc.Bekle(2);

        WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));//login bul
        new Actions(driver).moveToElement(login).click().build().perform();

        WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));//mail kutucuğuna git
        new Actions(driver)
                .moveToElement(Email)
                .click()
                .sendKeys("sefacanbasoglu11@gmail.com")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));//password  kutucuğuna git
        MyFunc.Bekle(2);

        new Actions(driver)
                .moveToElement(Password)
                .click()
                .sendKeys("Sefa1234.")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement LogIn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));// log in tıkla
        new Actions(driver)
                .moveToElement(LogIn)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement LoginOpen=driver.findElement(By.xpath("//a[@class='account']"));
        if (LoginOpen.getText().equals("sefacanbasoglu11@gmail.com"));
        System.out.println("The session has successfully opened");

        driver.quit();


    }
    }

