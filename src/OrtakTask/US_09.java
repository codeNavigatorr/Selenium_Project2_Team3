package OrtakTask;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US_09 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(5);

        WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
        new Actions(driver)
                .moveToElement(login)
                .click()
                .build()
                .perform();
        // login.click();
        MyFunc.Bekle(3);

        WebElement email = driver.findElement(By.id("Email"));
        new Actions(driver)
                .moveToElement(email)
                .click()
                .sendKeys("team3@gmail.com")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.id("Password"));
        new Actions(driver)
                .moveToElement(password)
                .click()
                .sendKeys("123456")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement rememberme = driver.findElement(By.xpath("//label[@for='RememberMe']"));
        new Actions(driver)
                .moveToElement(rememberme)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement login1 = driver.findElement(By.cssSelector("[value='Log in']"));
        new Actions(driver)
                .moveToElement(login1)
                .click()
                .build()
                .perform();
        // login1.click();click
        MyFunc.Bekle(2);

        WebElement accountName = driver.findElement(By.xpath("(//a[@href='/customer/info'])[1]"));
        new Actions(driver) // Anasayfada hesabim'a tikla
                .moveToElement(accountName)
                .click()
                .build().perform();
        MyFunc.Bekle(2);

        WebElement orders = driver.findElement(By.cssSelector("[href='/customer/orders'].inactive")); // Order button
        new Actions(driver)  // Order buttonuna tikla
                .moveToElement(orders)
                .click()
                .build().perform();
        MyFunc.Bekle(2);

        WebElement orderNo1 = driver.findElement(By.xpath("(//input[@class='button-2 order-details-button'])[1]"));
        new Actions(driver)  // En son order'a tikla
                .moveToElement(orderNo1)
                .click()
                .build().perform();
        MyFunc.Bekle(2);

        WebElement details = driver.findElement(By.linkText("PDF Invoice"));
        new Actions(driver)  // En son order'a tikla
                .moveToElement(details)
                .click()
                .build().perform();


        BekleKapat();
}}
