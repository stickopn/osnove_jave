package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak5 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/modal-dialogs");
        driver.findElement(By.id("showLargeModal"))
                .click();
        Thread.sleep(2000);
        if (elementExist(driver, By.id("example-modal-sizes-title-lg"))) {
            System.out.println("Dijalog postoji");
        } else {
            System.out.println("Dijalog ne postoji");
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

//5. Zadatak
//• Učitati stranicu https://demoqa.com/modal-dialogs
//        • Kliknuti na dugme Large modal
//• Proverite da li se prikazao dijalog i ispišite u konzoli odgovarajuće poruke