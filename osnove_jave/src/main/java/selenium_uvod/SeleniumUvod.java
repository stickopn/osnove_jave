package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUvod {
    static void main() throws InterruptedException {
//        Ova naredba "setProperty" postavi ovu promenljivu "webdriver.chrome.driver" i proveri putanju
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/"); // Prvi nacin za otvaranje stranice nema istoriju otvaranja

        driver.navigate().to("https://www.ebay.com/"); // Drugi nacin i on ima istoriju otvaranja
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back(); // Kao sto je vracanje korak unazad
        driver.navigate().forward(); // Dok ce ova metoda da nas vrati napred

//        Da nam se program uveca na sirinu ekrana .maximize()
        driver.manage().window().maximize();
//         Prvi nacin
//       WebElement input = driver.findElement(By.xpath("//input[@id='gh-ac']"));
//       input.sendKeys("Shoes");
//        Drugi nacin
        driver
                .findElement(By.xpath("//input[@id='gh-ac']"))
                .sendKeys("Shoes");
//        Ova metoda pauzira program na 1s
        Thread.sleep(1000);
        driver
                .findElement(By.xpath("//input[@id='gh-ac']"))
                .sendKeys("Shoesstrtr");
        Thread.sleep(1000);
        driver
                .findElement(By.xpath("//input[@id='gh-ac']"))
                .sendKeys("Shoeseyrthfg");
        Thread.sleep(1000);

//       WebElement button = driver.findElement(By.xpath("//input[@id='gh-btn']"));
//       button.click();
        driver
                .findElement(By.xpath("//button[@id='gh-search-btn']"))
                .click();
        Thread.sleep(2000);
//        Ovo je metoda koja ponistava ono sto se desilo u kreiranju
        driver.quit();
    }
}
