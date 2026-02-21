package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getRemoveButton(int rowIndex) {
        return driver.findElements(By.className("remove")).get(rowIndex);
    }

    public void waitForNumberOfProductRowsToBe(int productNum) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("cart_item"), productNum));
    }

    public List<WebElement> getProductRows() {
        return driver.findElements(By.className("cart_item"));
    }

    public WebElement getCouponInput() {
        return driver.findElement(By.id("coupon_code"));
    }

    public WebElement getApplyCouponButton() {
        return driver.findElement(By.name("apply_coupon"));
    }

    public WebElement getUpdateCartButton() {
        return driver.findElement(By.name("update_cart"));
    }
}
