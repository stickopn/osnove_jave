package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url ="https://demoga.com/login";
        String userName = "itbootcamp";
        String password = "ITBootcamp2021!";

        driver.manage().window().maximize();
        driver.navigate().to(url);

        driver
//                .findElement(By.xpath("//*[@id='userName']"))
                .findElement(By.id("userName"))
                .sendKeys(userName);
        driver
                .findElement(By.xpath("//*[@placegholder='Password']"))
                .sendKeys(password);
        driver
                .findElement(By.xpath("//form[@id='userForm']/div[contains(@class,'buttonWrap')]/div/button"))
                .click();
        Thread.sleep(5000);
        driver
                .findElement(By.xpath("//button[text() = 'Log out']"))
                .click();
        driver.quit();

    }
}

//2. Zadatak
//Napisati program koji:
//        • Maksimizuje prozor
//• Učitava stranicu https://demoga.com/login
//        • Za username unosi itbootcamp.
//Xpath za traženje ovog elementa treba da bude preko id atributa.
//• Za lozinku unosi ITBootcamp2021!
//Xpath za traženje ovog elementa treba da bude preko placeholder atributa.
//• Klikne na dugme Login.
//Xpath ovog elementa treba da bude tako da se prvo dohvati
//form element i da se od njega spusti do dugmeta
//• Čeka 5 sekundi
//• Klikne na dugme Log out.
//Xpath ovog elementa treba da bude po tekstu elementa.
//• Koristan link i podsetnik
//• Zatvara pretraživač

