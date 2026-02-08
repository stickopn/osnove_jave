package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumUvodListe {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/n8loy";
        driver.navigate().to(url);

        List<WebElement> checkboxes =  driver.findElements(By.xpath("//input[@tipe='checkbox']"));
        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
            Thread.sleep(1000);
        }

        driver.quit();
    }
}
