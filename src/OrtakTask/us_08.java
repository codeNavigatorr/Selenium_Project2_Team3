package OrtakTask;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class us_08 extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(5);

        WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
        new Actions(driver)
                .moveToElement(login)
                .click()
                .build()
                .perform();
        // login.click();
        MyFunc.Bekle(5);

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


        WebElement computers = driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
        new Actions(driver)
                .moveToElement(computers)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement desktop = driver.findElement(By.xpath("//img[@alt='Picture for category Desktops']"));
        new Actions(driver)
                .moveToElement(desktop)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement addcart1 = driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]"));
        new Actions(driver)
                .moveToElement(addcart1)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement addtoCart2 = driver.findElement(By.id("add-to-cart-button-72"));
        new Actions(driver)
                .moveToElement(addtoCart2)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement shopingcart = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
        new Actions(driver)
                .moveToElement(shopingcart)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);

        List<String> productinfo = new ArrayList<>();
        WebElement name = driver.findElement(By.xpath("(//div[@class='attributes'])[1]"));
        WebElement price = driver.findElement(By.cssSelector("[class='product-unit-price']"));
        WebElement qtr = driver.findElement(By.cssSelector("[class='product-subtotal']"));

        productinfo.add("Urun Adi= " + name.getText());
        productinfo.add("Urun Fiyati=" + price.getText());
        productinfo.add("Urun Adeti=" + qtr.getText());

        for (String info : productinfo)
            System.out.println(info);

        WebElement apllyCoupon = driver.findElement(By.cssSelector("[name='applydiscountcouponcode']"));
        new Actions(driver)
                .moveToElement(apllyCoupon)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement couponMessage = driver.findElement(By.cssSelector("[class='message']"));
        couponMessage.getText();
        System.out.println("Kupon Mesaji = " + couponMessage.getText());
        MyFunc.Bekle(2);

        WebElement giftCard = driver.findElement(By.cssSelector("[value='Add gift card']"));
        new Actions(driver)
                .moveToElement(giftCard)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);


        WebElement giftMesage = driver.findElement(By.cssSelector("[class='message']"));
        giftMesage.getText();
        System.out.println("Hediye Karti Mesaji = " + giftMesage.getText());

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
        MyFunc.Bekle(2);

        WebElement company = driver.findElement(By.id("BillingNewAddress_Company"));
        new Actions(driver)
                .moveToElement(company)
                .click()
                .sendKeys("TechnoStudy")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement counttry=driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select ulke=new Select(counttry);
        ulke.selectByValue("2");
        MyFunc.Bekle(2);

        WebElement statte=driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select stte=new Select(statte);
        stte.selectByValue("65");
        MyFunc.Bekle(2);

        WebElement cityy=driver.findElement(By.id("BillingNewAddress_City"));
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

        WebElement zipposta=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
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

        WebElement billingAdress = driver.findElement(By.id("billing-address-select"));
        System.out.println(billingAdress.getText());
        MyFunc.Bekle(2);


        WebElement continue2 = driver.findElement(By.cssSelector("[class='button-1 new-address-next-step-button'][onclick='Billing.save()']"));
        new Actions(driver)
                .moveToElement(continue2)
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
        MyFunc.Bekle(3);

        WebElement continue3 = driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        new Actions(driver)
                .moveToElement(continue3)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(3);

        WebElement creditCard = driver.findElement(By.id("paymentmethod_2"));
        new Actions(driver)
                .moveToElement(creditCard)
                .click()
                .build()
                .perform();

        WebElement continue4 = driver.findElement(By.cssSelector("[class='button-1 payment-method-next-step-button']"));
        new Actions(driver)
                .moveToElement(continue4)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(3);

        WebElement selectCard = driver.findElement(By.id("CreditCardType"));
        Select card = new Select(selectCard);
        card.selectByValue("Visa");
        MyFunc.Bekle(3);

        WebElement cardHolderName = driver.findElement(By.xpath("//input[@id='CardholderName' and @style='Width: 165px;']"));
        new Actions(driver)
                .moveToElement(cardHolderName)
                .click()
                .sendKeys("Team3")
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement cardNumber = driver.findElement(By.cssSelector("input[maxlength='22']"));
        new Actions(driver)
                .moveToElement(cardNumber)
                .click()
                .sendKeys("4242 4242 4242 4242")
                .build()
                .perform();
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
        MyFunc.Bekle(2);

        WebElement continue5 = driver.findElement(By.cssSelector("input[onclick='PaymentInfo.save()']"));
        new Actions(driver)
                .moveToElement(continue5)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(3);


        WebElement confirm = driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        new Actions(driver)
                .moveToElement(confirm)
                .click()
                .build()
                .perform();
        MyFunc.Bekle(2);

        WebElement confirmheader = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        System.out.println(confirmheader.getText());





        BekleKapat();









    }
}
