package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak5 {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/z80en";
        driver.navigate().to(url);

        List<WebElement> column = driver.findElements(By.xpath("//*[@id='lorem']/table/tbody/tr/td[1]"));

        for (int i = 0; i < column.size(); i++) {
            String text = column.get(i).getText();
            System.out.println(text);
            Thread.sleep(1000);
        }

        driver.quit();
    }
}

//5. Zadatak
//Napisati program koji:
//        • Učitava stranicu https://s.bootsnipp.com/iframe/z80en
//        • Hvata sve elemente prve kolone i štampa tekst svakog elementa.
//Kako od nekog elementa pročitati tekst imate na sledećem linku
//• Čeka 1s
//• Hvata sve elemente prvog reda i štampa tekst svakog elementa
//• Čeka 5s
//• Zatvara pretraživač

