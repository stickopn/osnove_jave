package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url ="https://cms.demo.katalon.com/";
        String searchText = "Flying Ninja";
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver
//                .findElement(By.xpath("//input[@name='s']"))
//                Ali ako zelimo da specificiramo bas input kao xpath onda moramo gornje resenje isto kao i za button
                .findElement(By.name("s"))
                .sendKeys(searchText);

        driver
//                .findElement(By.xpath("//button[@class='search-submit']"))
//                className znaci contains, da li sadrzi tu klasu
                .findElement(By.className("search-submit"))
                .click();
        Thread.sleep(5000);
        driver.quit();
    }
}

//1. Zadatak
//Napisati program koji:
//        • Maksimizuje prozor
//• Učitava stranicu https://cms.demo.katalon.com/
//        • U delu za pretragu unosi tekst Flying Ninja.
//Xpath za traženje ovog elementa treba da bude preko name atributa.
//• Klikne na dugme za pretragu. Dugme sa lupom.
//Kada tražite element dohvatite element koji je po tagu button a ne span.
//Xpath za traženje ovog elementa treba da bude preko class atributa.
//        • Čeka 5 sekundi
//• Zatvara pretraživač

