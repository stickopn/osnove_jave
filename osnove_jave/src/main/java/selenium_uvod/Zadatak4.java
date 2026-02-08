package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Zadatak4 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/oV91g";
        driver.navigate().to(url);

        List<WebElement> pagination =  driver.findElements(By.xpath("//*[contains(@class, 'page_link')]"));
        for (int i = 0; i < pagination.size(); i++) {
            pagination.get(i).click();
            Thread.sleep(1000);
        }

        driver.quit();
    }
}

//4. Zadatak
//Napisati program koji:
//        • Učitava stranicu https://s.bootsnipp.com/iframe/V91g
//        • Hvata sve page-eve iz paginacije tabele
//• Zatim petljom prolazi kroz paginaciju tako što kliknemo na svaki broj
//• Između iteracija napravite pauzu od 1s
//• Zatvorite pretraživač
