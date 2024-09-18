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

import java.util.List;

public class us_06 extends BaseDriver {

    @Test
    public void Test1() {
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

        WebElement addToCard = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
        //body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.product-grid > div:nth-child(1) > div > div.details > div.add-info > div.buttons > input
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


        WebElement billingAdress = driver.findElement(By.cssSelector("[name='billing_address_id']"));
        Select biling = new Select(billingAdress);
        biling.selectByVisibleText("New Address");
        MyFunc.Bekle(2);

        WebElement company = driver.findElement(By.id("BillingNewAddress_Company"));
        new Actions(driver)
                .moveToElement(company)
                .click()
                .sendKeys("TechnoStudy")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement counttry = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select ulke = new Select(counttry);
        ulke.selectByValue("2");
        MyFunc.Bekle(2);

        WebElement statte = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select stte = new Select(statte);
        stte.selectByValue("65");
        MyFunc.Bekle(2);

        WebElement cityy = driver.findElement(By.id("BillingNewAddress_City"));
        new Actions(driver)
                .moveToElement(cityy)
                .click()
                .sendKeys("Istanbul")
                .build()
                .perform();
        MyFunc.Bekle(2);


        WebElement adres01 = driver.findElement(By.id("BillingNewAddress_Address1"));
        new Actions(driver)
                .moveToElement(adres01)
                .click()
                .sendKeys("Kadikoy")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement adress = driver.findElement(By.id("BillingNewAddress_Address2"));
        new Actions(driver)
                .moveToElement(adress)
                .click()
                .sendKeys("Her yerde...")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement zipposta = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        new Actions(driver)
                .moveToElement(zipposta)
                .click()
                .sendKeys("Ct-034")
                .build()
                .perform();
        MyFunc.Bekle(2);


        WebElement phoneNumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        new Actions(driver)
                .moveToElement(phoneNumber)
                .click()
                .sendKeys("0212-000-00-00")
                .build()
                .perform();
        MyFunc.Bekle(2);
        WebElement continueAdres = driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]"));
        new Actions(driver)
                .moveToElement(continueAdres)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(3);


        WebElement inStorePickup = driver.findElement(By.id("PickUpInStore"));
        new Actions(driver)
                .moveToElement(inStorePickup)
                .click()
                .build()
                .perform();
        //inStorePickup.click();
        MyFunc.Bekle(4);

        WebElement instoreContinue = driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        instoreContinue.click();
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

        List<WebElement> fees = driver.findElements(By.cssSelector("span[class='product-subtotal']"));
        double toplam = 0;
        for (WebElement f : fees) {
            System.out.println(f.getText());
            System.out.println(f.getText().replaceAll("[^0-9,.]", ""));
            toplam = toplam + Double.parseDouble(f.getText().replaceAll("[^0-9,.]", ""));
        }

        WebElement total = driver.findElement(By.cssSelector("[class='product-price order-total']"));
        double alltotal = Double.parseDouble(total.getText().replaceAll("[^0-9,.]", ""));
        System.out.println(alltotal);

        if (toplam == alltotal) {
            System.out.println("Toplam Esittir");
        } else System.out.println("ToplamEsit Degildir");

        //  Assert.assertTrue("Toplam Esit Degil", toplam == alltotal);


        WebElement scrool = driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        new Actions(driver)
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

        WebElement confirmheader = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        //confirmheader.getText();
        System.out.println(confirmheader.getText());
        BekleKapat();

    }
}

