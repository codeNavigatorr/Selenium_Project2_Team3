package Kaya;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_20301_Logout extends BaseDriver {

    @Test
    public void Test1() {

        driver.navigate().to("https://demowebshop.tricentis.com");
        MyFunc.Bekle(2);

        WebElement loginButton = driver.findElement(By.cssSelector("a[href='/login']")); // login button
        new Actions(driver).moveToElement(loginButton).click().build().perform();  // click on login button
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.cssSelector("div>input[class='email']")); // email input
        new Actions(driver)  // email for login keys sent
                .moveToElement(email)
                .sendKeys("yusuf@gmail.com")
                .build().perform();
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.cssSelector("div>input[class='password']")); //password input
        new Actions(driver) // password sent
                .moveToElement(password)
                .click()
                .sendKeys("123456")
                .build().perform();
        MyFunc.Bekle(2);

        WebElement loginClick = driver.findElement(By.cssSelector("[value='Log in']")); // login button
        new Actions(driver) // click on login with email and password
                .moveToElement(loginClick)
                .click()
                .build()
                .perform();
        // login1.click();click
        MyFunc.Bekle(2);

        ///// Successful Login

        WebElement usernameVerification = driver.findElement(By.cssSelector("div[class='header-links'] a[href='/customer/info'].account"));
        Assert.assertTrue("Username not displayed", usernameVerification.getText().contains("yusuf")); // Check for Username display, Assert True


        ////// Logout
        WebElement logoutButton = driver.findElement(By.cssSelector("div.header-links .ico-logout")); //logout button
        new Actions(driver) // click - logout button
                .moveToElement(logoutButton)
                .click()
                .build().perform();
        MyFunc.Bekle(2);

        ////// Successful Logout - Displays: Register Button

        WebElement register = driver.findElement(By.cssSelector("a.ico-register"));
        Assert.assertTrue("Register not displayed", register.isDisplayed());

        driver.quit();


    }
}

