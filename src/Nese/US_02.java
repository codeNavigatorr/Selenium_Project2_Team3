package Nese;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class US_02 extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demowebshop.tricentis.com");

        WebElement btnClick=driver.findElement(By.xpath("//*[text()='Register']"));
        Actions aksiyonlar=new Actions(driver);  // web sayfası aksiyonlara açıldı.
        Action aksiyon= aksiyonlar.moveToElement(btnClick).click().build();
        // elementin üzerin click için git orda bekle.aksiyonu HAZIRLA.

        MyFunc.Bekle(2);
        aksiyon.perform();


        WebElement btnRClick=driver.findElement(By.xpath("//*[@value='M']"));
        Action aksiyon2= aksiyonlar.moveToElement(btnRClick).click().build();

        MyFunc.Bekle(2);
        aksiyon2.perform();



        WebElement name=driver.findElement(By.xpath("//*[@name='FirstName']"));
        new Actions(driver)
                .moveToElement(name)
                .click()
                .sendKeys("Team")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement lastname=driver.findElement(By.xpath("//*[@id='LastName']"));
        new Actions(driver)
                .moveToElement(lastname)
                .click()
                .sendKeys("three")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement email=driver.findElement(By.xpath("//*[@id='Email']"));
        new Actions(driver)
                .moveToElement(email)
                .click()
                .sendKeys("betultechno@gmail.com")
                .build()
                .perform();
        MyFunc.Bekle(2);

        //Password

        WebElement password=driver.findElement(By.xpath("//*[@id='Password']"));
        new Actions(driver)
                .moveToElement(password)
                .click()
                .sendKeys("pass1234")
                .build()
                .perform();
        MyFunc.Bekle(2);

        //ConfirmPassword
        WebElement confirmpassword=driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
        new Actions(driver)
                .moveToElement(confirmpassword)
                .click()
                .sendKeys("pass1234")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement register=driver.findElement(By.xpath("//*[@name='register-button']"));
        new Actions(driver)
                .moveToElement(register)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);

        new Actions(driver)
                //.scrollToElement(register)
                .scrollByAmount(0, 1000)// verilen pixel miktarı kadar scroll yap
                .build()
                .perform();


        WebElement result=driver.findElement(By.xpath("//*[@class='page-body']/div[1]"));
        Assert.assertTrue("Registration Page değil",result.isDisplayed());

        BekleKapat();
}
