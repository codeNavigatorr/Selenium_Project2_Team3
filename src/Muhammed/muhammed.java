package Muhammed;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utility.BaseDriver.driver;

public class muhammed extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);

        Actions aksiyon = new Actions(driver);

        WebElement excellent1 = driver.findElement(By.xpath("//*[@name='pollanswers-1' and @value='1']"));
        aksiyon.click(excellent1)
                .build()
                .perform();

        MyFunc.Bekle(2);

        WebElement vote1 = driver.findElement(By.xpath("//*[@id='vote-poll-1']"));
        aksiyon
                .click(vote1)
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement mesaj = driver.findElement(By.xpath("//div[@id='block-poll-vote-error-1']"));

        Assert.assertTrue("Mesaj görüntülenemedi", mesaj.isDisplayed());

        MyFunc.Bekle(2);

        WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));

        aksiyon
                .click(login)
                .build()
                .perform();

        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.xpath("//*[@id='Email']"));

        aksiyon
                .moveToElement(email)
                .click()
                .sendKeys("bilalyazici@gmail.com")
                .build()
                .perform();

        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.xpath("//*[@id='Password']"));

        aksiyon
                .moveToElement(password)
                .click()
                .sendKeys("bilal123")
                .build()
                .perform();

        MyFunc.Bekle(2);

        WebElement login2 = driver.findElement(By.xpath("//*[@class='button-1 login-button']"));

        aksiyon
                .moveToElement(login2)
                .click()
                .build()
                .perform();

        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='pollanswers-1' and @value='1']")));

        WebElement excellent2 = driver.findElement(By.xpath("//*[@name='pollanswers-1' and @value='1']"));
        aksiyon
                .click(excellent2)
                .build()
                .perform();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='vote-poll-1']")));
        WebElement vote2 = driver.findElement(By.xpath("//*[@id='vote-poll-1']"));
        aksiyon
                .click(vote2)
                .build()
                .perform();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='poll-block-1']/ul")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='poll-block-1']/ul/following-sibling::span")));

        WebElement anketsonuc = driver.findElement(By.xpath("//div[@id='poll-block-1']/ul"));
        WebElement oysayisi = driver.findElement(By.xpath("//div[@id='poll-block-1']/ul/following-sibling::span"));

        Assert.assertTrue("Anket sonuçları görüntülenemiyor", anketsonuc.isDisplayed());
        Assert.assertTrue("Oy kullanan sayısı görüntülenemiyor",oysayisi.isDisplayed());

        BekleKapat();


    }


}
