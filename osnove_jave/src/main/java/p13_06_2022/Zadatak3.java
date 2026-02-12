package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;

public class Zadatak3 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.file.io/");

        File file = new File("src/main/resources/ptica.jpg");

        driver.findElement(By.id("select-files-input")).sendKeys(file.getAbsolutePath());
        Thread.sleep(10000);

        driver.quit();
    }
}

//Zadatak
//Napisati program koji testira upload funkcionalnost. Koristan link:
//https://www.guru99.com/upload-file-selenium-webdriver.html
//        • Učitava stranicu https://crop-circle.imageonline.co/#circlecropresult
//        • Uploaduje sliku na sajt
//• Klikne na dugme Crop Circle