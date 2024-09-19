package Alper;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class US_05 extends BaseDriver {

    @Test
    public void Test1(){


        driver.get("https://demowebshop.tricentis.com");

        WebElement btnClick=driver.findElement(By.xpath("//*[@class=\"ico-login\"]"));
        Actions aksiyonlar=new Actions(driver);  // web sayfası aksiyonlara açıldı.
        Action aksiyon= aksiyonlar.moveToElement(btnClick).click().build();
        // elementin üzerin click için git orda bekle.aksiyonu HAZIRLA.


        MyFunc.Bekle(2);
        aksiyon.perform();





        WebElement Email=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        new Actions(driver)
                .moveToElement(Email)
                .click()
                .sendKeys("")
                .build()
                .perform();
        MyFunc.Bekle(2);


        WebElement Password=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        new Actions(driver)
                .moveToElement(Password)
                .click()
                .sendKeys("")
                .build()
                .perform();
        MyFunc.Bekle(2);


        WebElement LoginB=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        new Actions(driver)
                .moveToElement(LoginB)
                .click()
                .build()
                .perform();


        WebElement result=driver.findElement(By.xpath("//*[text()='No customer account found']"));
        Assert.assertTrue("Hata Mesajı çıkmadı ",result.isDisplayed());





        WebElement Email1=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        new Actions(driver)
                .moveToElement(Email1)
                .click()
                .sendKeys("tecnoteam@gmail.com")
                .build()
                .perform();
        MyFunc.Bekle(2);


        WebElement Password1=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        new Actions(driver)
                .moveToElement(Password1)
                .click()
                .sendKeys("")
                .build()
                .perform();
        MyFunc.Bekle(2);


        WebElement LoginB1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        new Actions(driver)
                .moveToElement(LoginB1)
                .click()
                .build()
                .perform();





        WebElement LoginB2=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        new Actions(driver)
                .moveToElement(LoginB2)
                .click()
                .build()
                .perform();

        MyFunc.Bekle(2);





        WebElement Email2=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        new Actions(driver)
                .moveToElement(Email2)
                .click()
                .sendKeys("")
                .build()
                .perform();
        MyFunc.Bekle(2);


        WebElement Password2=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        new Actions(driver)
                .moveToElement(Password2)
                .click()
                .sendKeys("pass1234")
                .build()
                .perform();
        MyFunc.Bekle(2);



        WebElement LoginB3=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        new Actions(driver)
                .moveToElement(LoginB3)
                .click()
                .build()
                .perform();

        MyFunc.Bekle(1);


        WebElement result1=driver.findElement(By.xpath("//*[text()='No customer account found']"));
        Assert.assertTrue("Hata Mesajı çıkmadı ",result1.isDisplayed());









        WebElement LoginB6=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        new Actions(driver)
                .moveToElement(LoginB6)
                .click()
                .build()
                .perform();




        WebElement Email3=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        new Actions(driver)
                .moveToElement(Email3)
                .click()
                .sendKeys("sjdcjdhckck@gmail.com")
                .build()
                .perform();
        MyFunc.Bekle(2);


        WebElement Password3=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        new Actions(driver)
                .moveToElement(Password3)
                .click()
                .sendKeys("jfbfjfjkkj")
                .build()
                .perform();
        MyFunc.Bekle(2);







        WebElement LoginB4=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        new Actions(driver)
                .moveToElement(LoginB4)
                .click()
                .build()
                .perform();




        WebElement result2=driver.findElement(By.xpath("//*[text()='No customer account found']"));
        Assert.assertTrue("Hata Mesajı çıkmadı ",result2.isDisplayed());



        }
}
