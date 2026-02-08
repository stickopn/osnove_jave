package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Zadatak3 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        WebElement selectEl = driver.findElement(By.name("_sacat"));
        Select select = new Select(selectEl);
        List<WebElement> options = select.getOptions();

//        Prvi nacin za selekotvanje random opcije iz dropdown-a
        Random random = new Random();
        int randumIndex = random.nextInt(options.size());
        select.selectByIndex(randumIndex);
        Thread.sleep(2000);

//        Drigi nacin za selekotvanje random opcije iz dropdown-a
        randumIndex = random.nextInt(options.size());
        String text = options.get(randumIndex).getText();
        select.selectByVisibleText(text);
        Thread.sleep(2000);

        driver.quit();
    }
}

//3. Zadatak
//Napisati program koji:
//        • Učitava stranicu https://www.ebay.com/
//        • Zatim iz selekta za kategoriju povlači sve opcije. Koristan link
//• Zatim bira random element iz niza opcija koristeći Random.
//Vodite računa da random element bude u opsegu broja elemenata niza.
//        Random podsetnik
//• Selektuje random kategoriju izabranu u koraku iznad
//• Zatvara pretraživač