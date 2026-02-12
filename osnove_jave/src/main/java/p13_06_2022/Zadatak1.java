package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class Zadatak1 {
    static void main() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://docs.katalon.com/");
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("/html"));
        String theme = driver.findElement(By.tagName("html")).getAttribute("data-theme");
        if(theme.equals("light")) {
            System.out.println("Sve okej");
        } else {
            System.out.println("Nije okej");
        }
//        driver.findElement(By.xpath("//*[contains(@class, 'toggleButton_gllP')]")).click();
        driver.findElement(By.className("toggleButton_gllP")).click();
        theme = driver.findElement(By.tagName("html")).getAttribute("data-theme");
        if(theme.equals("dark")) {
            System.out.println("Sve okej");
        } else {
            System.out.println("Nije okej");
        }

        Actions actions = new Actions(driver);
//        Drzi CONTROL i pretisni "k", dok perform() ti izvrsi sve sto ste prethodno pozvali
        actions.keyDown(Keys.CONTROL).sendKeys("k").perform();

        String searchType = driver.findElement(By.id("docsearch-input")).getAttribute("type");
        if (searchType.equals("search")) {
            System.out.println("Sve okej");
        } else {
            System.out.println("Nije okej");
        }

        driver.quit();
    }
}

//1. Zad
//Napisati program koji:
//        • Pre nego što krenete u automatizaciju prvo sve korake uradite ručno
//• Implicitno čekanje za traženje elemenata je maksimalno 10s
//• Implicitno čekanje za učitavanje stranice je 5s
//• Učitava stranicu https://docs.katalon.com/
//        • Maksimizuje prozor
//• Od html elementa čita data-theme atribut
//    ○ Korisni linkovi za čitanje vrednosti atributa link1 i link2
//• Proverava da li je sadržaj u tom atributu light i ispisuje odgovarajuće poruke
//• Klikne na dugme za zamenu tema
//• Ponovo čita data-theme atribut elementa i validira da atribut stoji vrednost
//        dark
//• Izvršava kombinaciju tastera CTRL + K
//    ○ Koristan link za keyboard actions, kako izvršavati prečice preko Actions objekta
//• Zatim od inputa za pretragu čita atribut type i proverava da je vrednost tog
//atributa search
//• Zatvara pretraživač