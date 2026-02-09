package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak6 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("file:///C:/Users/LEGION/Desktop/Zadatak6.html");
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("showInBtn"))
                    .click();
//            prvi nacin
            driver.findElement(By.id("id-" + i));
//            uz pomoc last metode ali ne bi mogla da se iskoristi
//            driver.findElement(By.xpath("//body/div[last()]"));
//            ali mozda bi moglo - medjutim sigurnije je ovo prvo resenje
//            driver.findElement(By.xpath("//body/div[last() + 1]"));
        }
        driver.quit();

    }

    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }
}

//6. Zadatak
//Napisati program koji učitava stranicu Zadatak6.html
//• I na stranici dodaje 5 poruka "IT Bootcamp"
//        • Potrebno je u svakoj iteraciji kliknuti na dugme Show in
//• Sačekati da se novi element pojavi pre nego što se doda sledeći