package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Zadatak4 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url ="https://demoga.com/login";
        String userName = "itbootcamp";
        String password = "ITBootcamp2021!";

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
        if (elementExist(driver, By.xpath("//button[text() = 'Log out']"))) {
            driver
                    .findElement(By.xpath("//button[text() = 'Log out']"))
                    .click();
        } else  {
            System.out.println("Neuspesan login.");
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

//4. Zadatak
//• Učitava stranicu https://demoga.com/login
//        • Loginjuje se sa username itbootcamp i lozinkom ITBootcamp2021!
//        • Zatim čeka 5 sekundi da se korisnik uloguje
//• Proverava da li se korisnik ulogovao, tako što se proverava postojanje
//dugmeta Logout. Ispisati odgovarajuću poruku u konzoli za rezultat loginovanja.
//        • Klikće na dugme za logout
//• Gasi stranicu