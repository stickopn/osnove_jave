package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getQuantityInput() {
        return driver.findElement(By.name("quantity"));
    }

    public WebElement getAddToCartMessage() {
        return driver.findElement(By.className("woocommerce-message"));
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.name("add-to-cart"));
    }
}
