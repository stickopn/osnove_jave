package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavPage {
    private WebDriver driver;

    public NavPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCartLink() {
        return driver.findElement(By.linkText("CART"));
    }

    public WebElement getCheckoutLink() {
        return driver.findElement(By.linkText("CHECKOUT"));
    }

    public WebElement getMyAccountLink() {
        return driver.findElement(By.linkText("MY ACCOUNT"));
    }

    public WebElement getSamplePageLink() {
        return driver.findElement(By.linkText("SAMPLE PAGE"));
    }

    public WebElement getShopLink() {
        return driver.findElement(By.linkText("SHOP"));
    }
}
