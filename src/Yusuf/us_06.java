package Yusuf;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;

import Utility.BaseDriver;
import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class us_06 extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(5);

        WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
        new Actions(driver)
                .moveToElement(login)
                .click()
                .build()
                .perform();
        //login.click();
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.id("Email"));
        new Actions(driver)
                .moveToElement(email)
                .click()
                .sendKeys("yusuf@gmail.com")
                .build()
                .perform();
        //email.sendKeys("yusuf@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.id("Password"));
        new Actions(driver)
                .moveToElement(password)
                .click()
                .sendKeys("123456")
                .build()
                .perform();
        //password.sendKeys("123456");
        MyFunc.Bekle(2);

        WebElement rememberme = driver.findElement(By.xpath("//label[@for='RememberMe']"));
        new Actions(driver)
                .moveToElement(rememberme)
                .click()
                .build()
                .perform();
        //rememberme.click();
        MyFunc.Bekle(2);

        WebElement login1 = driver.findElement(By.cssSelector("[value='Log in']"));
        new Actions(driver)
                .moveToElement(login1)
                .click()
                .build()
                .perform();
        // login1.click();click
        MyFunc.Bekle(2);


        WebElement booksButon = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a"));
        new Actions(driver)
                .moveToElement(booksButon)
                .click()
                .build()
                .perform();
        //booksButon.click();
        MyFunc.Bekle(3);

        WebElement addToCard = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.product-grid > div:nth-child(1) > div > div.details > div.add-info > div.buttons > input"));
        new Actions(driver)
                .moveToElement(addToCard)
                .click()
                .build()
                .perform();
        //  addToCard.click();
        MyFunc.Bekle(2);

        WebElement shoppingCard = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
        new Actions(driver)
                .moveToElement(shoppingCard)
                .click()
                .build().perform();
        //shoppingCard.click();
        MyFunc.Bekle(3);
        //suraya kadar sorunsuz calisti

        WebElement country = driver.findElement(By.id("CountryId"));
        country.click();
        Select menu = new Select(country);
        menu.selectByValue("2");
        MyFunc.Bekle(3);

        WebElement state = driver.findElement(By.cssSelector("select[class='state-input']"));
        state.click();
        Select menu2 = new Select(state);
        menu2.selectByValue("64");
        MyFunc.Bekle(3);
        //suraya kadar sorunsuz calisti

        WebElement agree = driver.findElement(By.xpath("//input[@name='termsofservice']"));
        new Actions(driver)
                .moveToElement(agree)
                .click()
                .build()
                .perform();
        //agree.click();
        MyFunc.Bekle(2);

        WebElement checkout = driver.findElement(By.id("checkout"));
        new Actions(driver)
                .moveToElement(checkout)
                .click()
                .build()
                .perform();
        //checkout.click();
        MyFunc.Bekle(2);

        WebElement billingAdress=driver.findElement(By.id("billing-address-select"));
        //billingAdress.getText();
        System.out.println(billingAdress.getText());
        MyFunc.Bekle(2);




        WebElement continue2 = driver.findElement(By.cssSelector("[class='button-1 new-address-next-step-button'][onclick='Billing.save()']"));
        new Actions(driver)
                .moveToElement(continue2)
                .click()
                .build()
                .perform();
        //continue2.click();
        MyFunc.Bekle(3);

        WebElement inStorePickup = driver.findElement(By.id("PickUpInStore"));
        new Actions(driver)
                .moveToElement(inStorePickup)
                .click()
                .build()
                .perform();
        //inStorePickup.click();
        MyFunc.Bekle(3);

        WebElement continue3 = driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        new Actions(driver)
                .moveToElement(continue3)
                .click()
                .build()
                .perform();
        //continue3.click();
        MyFunc.Bekle(3);

        WebElement creditCard = driver.findElement(By.id("paymentmethod_2"));
        new Actions(driver)
                .moveToElement(creditCard)
                .click()
                .build()
                .perform();
        //creditCard.click();
        MyFunc.Bekle(3);

        WebElement continue4 = driver.findElement(By.cssSelector("[class='button-1 payment-method-next-step-button']"));
        new Actions(driver)
                .moveToElement(continue4)
                .click()
                .build()
                .perform();
        //continue4.click();
        MyFunc.Bekle(3);

        WebElement selectCard = driver.findElement(By.id("CreditCardType"));
        Select card = new Select(selectCard);
        card.selectByValue("Visa");
        MyFunc.Bekle(3);

        WebElement cardHolderName = driver.findElement(By.xpath("//input[@id='CardholderName' and @style='Width: 165px;']"));
        new Actions(driver)
                .moveToElement(cardHolderName)
                .click()
                .sendKeys("Hakan")
                .build()
                .perform();
        //cardHolderName.sendKeys("Hakan");
        MyFunc.Bekle(2);

        WebElement cardNumber = driver.findElement(By.cssSelector("input[maxlength='22']"));
        new Actions(driver)
                .moveToElement(cardNumber)
                .click()
                .sendKeys("4242 4242 4242 4242")
                .build()
                .perform();
        //cardNumber.sendKeys("4242 4242 4242 4242");
        MyFunc.Bekle(2);

        WebElement expirationDate = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        Select menu3 = new Select(expirationDate);
        menu3.selectByValue("1");
        MyFunc.Bekle(2);

        WebElement expirationDate2 = driver.findElement(By.id("ExpireYear"));
        Select menu4 = new Select(expirationDate2);
        menu4.selectByValue("2032");
        MyFunc.Bekle(2);


        WebElement cardCode = driver.findElement(By.cssSelector("input[maxlength='4']"));
        new Actions(driver)
                .moveToElement(cardCode)
                .click()
                .sendKeys("123")
                .build()
                .perform();
        //cardCode.sendKeys("123");
        MyFunc.Bekle(2);

        WebElement continue5 = driver.findElement(By.cssSelector("input[onclick='PaymentInfo.save()']"));
        new Actions(driver)
                .moveToElement(continue5)
                .click()
                .build()
                .perform();
        //continue5.click();
        MyFunc.Bekle(3);

        WebElement total = driver.findElement(By.cssSelector("span[class='product-subtotal']"));
        total.getText();
        Double.parseDouble(total.getText().replaceAll("[^0-9,.]", ""));
        System.out.println(total.getText());

        MyFunc.Bekle(2);

        WebElement alltotal = driver.findElement(By.cssSelector("[class='product-price order-total']"));
        alltotal.getText();
        Double.parseDouble(alltotal.getText().replaceAll("[^0-9,.]", ""));
        System.out.println(alltotal.getText());

        if (total == alltotal) {
            System.out.println("Toplam Esittir");

        } else System.out.println("Toplam Esit Degil");

        Assert.assertTrue("Toplam Esit Degil",total==alltotal);

        WebElement scrool=driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        new Actions(driver)
                //.moveToElement(scrool)
                .scrollToElement(scrool)
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement confirm = driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        new Actions(driver)
                .moveToElement(confirm)
                .click()
                .build()
                .perform();
        //confirm.click();
        MyFunc.Bekle(2);
        WebElement confirmheader=driver.findElement(By.cssSelector("//div[@class='title']"));
        System.out.println(confirmheader.getText());
        driver.quit();


    }
}
