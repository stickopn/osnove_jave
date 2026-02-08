package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cms.demo.katalon.com/my-account/");
        driver
                .findElement(By.id("rememberme"))
                .click();
        Thread.sleep(1000);
        driver.quit();
    }
}

//        1. Zadatak
//Napisati program koji prijavljivanju na stranicu
//http://cms.demo.katalon.com/my-account/,
//čekira Remember me checkbox.