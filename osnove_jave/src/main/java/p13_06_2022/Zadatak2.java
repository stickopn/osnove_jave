package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;

public class Zadatak2 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        File slika = new File("src/main/resources/ptica.jpg");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        String putanjeDoFajla = "C:\\Users\\LEGION\\Desktop\\ptica.jpg"; - umesto ovoga imamo File slika putanja
        driver.get("https://crop-circle.imageonline.co/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        new Actions(driver)
                .scrollToElement(driver.findElement(By.id("photobutton")))
                        .perform();
        Thread.sleep(1000);
        driver.findElement(By.name("file")).sendKeys(slika.getAbsolutePath());

//        driver.quit();
    }
}

//Zadatak
//Napisati program koji testira upload funkcionalnost. Koristan link:
//https://www.guru99.com/upload-file-selenium-webdriver.html
//        • Učitava stranicu https://crop-circle.imageonline.co/#circlecropresult
//        • Uploaduje sliku na sajt
//• Klikne na dugme Crop Circle