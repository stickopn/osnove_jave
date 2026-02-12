package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Zadatak5 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://s.bootsnipp.com/iframe/kIDW");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Cekanje po tekstu
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("present"), "100%"));

//        Ovo je cekanje po atributu
//        wait.until(ExpectedConditions
//                .attributeToBe(By
//                        .className("preloader-wrap"),
//                        "style", "display: none;"));

//        Cekamo stanje dok taj element ne bude vidljiv u ovom slucaju klasa
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader-wrap")));


        Thread.sleep(10000);

        driver.quit();
    }
}

//Zadatak
//Napisati program koji učitava stranicu https://www.file.io/
//aploaduje fajl (proizvoljan, ali neka bude nekih 20tak MB)
//i cekamo da se prikaze link za download.