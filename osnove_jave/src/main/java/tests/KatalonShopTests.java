package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.CartPage;
import pages.NavPage;
import pages.ProductPage;

import java.time.Duration;

public class KatalonShopTests extends BasicTest {

    @Test(priority = 1)
    public void addingProductWithQualityToTheCart() {
        driver.navigate().to(getBaseUrl() + "/product/flying-ninja/");
        productPage.getQuantityInput().clear();
        productPage.getQuantityInput().sendKeys("3");
        productPage.getAddToCartButton().click();

        Assert.assertTrue(
                productPage.getAddToCartMessage().getText().contains("been added to your cart."),
                "Ne postoji tekst"
        );

        navPage.getCartLink().click();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/cart"),
                "Ne sadrzi cart"
        );
        Assert.assertEquals(cartPage.getProductRows().size(),
                1,
                "Ne sadrzi"
                );
    }

    @Test(priority = 2)
    public void removingProductFromCart() throws InterruptedException {
        navPage.getCartLink().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/cart"),
                "Ne sadrzi cart"
        );
        Assert.assertEquals(cartPage.getProductRows().size(),
                1,
                "Ne sadrzi"
        );
        cartPage.getRemoveButton(0).click();
//        Thread.sleep(2000);
//        Bolji nacin sa wait uradjenim
        cartPage.waitForNumberOfProductRowsToBe(0);
        Assert.assertEquals(cartPage.getProductRows().size(),
                0,
                "Ne sadrzi"
        );

    }


}

//Zadatak
//Kreirati NavPage koja ima:
//cart link
//checkout link
//my account link
//sample page link
//shop link
//Kreirati ProductPage koja ima:
//quantity
//add to cart button
//poruka o dodavanju proizvoda u korpu
//Kreirati CartPage
//hvata delete dugme za red po indeksu
//input za kupon
//dugme apply coupon
//update cart dugme
//hvata sve redove tabele
//Kreirati KatalonShopTests klasu:
//baseUrl: https://cms.demo.katalon.com
//
//Test #1: Adding product with quantity 3 to the cart
//Koraci:
//Učitati stranicu /product/flying-ninja/
//Unesite kolicinu 3
//Klik na Add to cart dugme
//Verifikovati da poruka sadrzi tekst “Flying Ninja”
//Klik na Cart link iz navigacije
//Verifikovati da u url-u stoji /cart ruta
//Verifikovati da je broj proizvoda u korpi jednako 1
//
//Test #2: Removing product from cart
//Koraci:
//Klik na Cart link iz navigacije
//Verifikovati da u url-u stoji /cart ruta
//Verifikovati da je broj proizvoda u korpi jednako 1
//Klik na remove dugme iz prvog reda
//Verifikovati da je broj proizvoda u korpi jednako 0