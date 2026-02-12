package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class UvodWaiters {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/LEGION/Desktop/Zadatak6.html");
        driver.findElement(By.id("showInBtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id-0")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("showInBtn")));
//        Ovo je kada se ceka da element bude vidljiv na web-u, da nije display none ili visibility none
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id-0")));
//        Cekaj dok se npr broj komentara sa tagName-om "a" ne ucita 10 njih ispod videa na youtube-u
        wait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 10));

        Thread.sleep(1000);
        driver.quit();
    }
}

//U SUSTINI IMPLICITNO CEKANJE JE ZA TRAZENJE ELEMENTA, DOK EKSPLICITNO KADA ZNAMO DA JE NEKO NEIZVESNO CEKANJE
//        NA PRIMER ZA UPLOAD-OVANJE FAJLA