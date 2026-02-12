package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Zadatak4 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.file.io/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        File file = new File("src/main/resources/ptica.jpg");
        driver.findElement(By.id("select-files-input")).sendKeys(file.getAbsolutePath());
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[.//span[normalize-space()='Download All']]")));
        Thread.sleep(10000);

        driver.quit();
    }
}

//Zadatak
//Napisati program koji učitava stranicu https://www.file.io/
//aploaduje fajl (proizvoljan, ali neka bude nekih 20tak MB)
//i cekamo da se prikaze link za download.