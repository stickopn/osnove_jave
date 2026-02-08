package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        WebElement selectEl = driver.findElement(By.name("_sacat"));
        Select select = new Select(selectEl);

        select.selectByIndex(2);
        Thread.sleep(2000);

        select.selectByValue("267");
        Thread.sleep(2000);

        select.selectByVisibleText("Crafts");
        Thread.sleep(2000);

        driver.quit();
    }
}

//2. Zadatak (dok ne stignemo do ovog zadatka izgooglajte kako da selektujete
//        vrednost u select elementu)
//
//Napisati program koji učitava stranicu https://www.ebay.com/
//i bira kategoriju "Crafts".