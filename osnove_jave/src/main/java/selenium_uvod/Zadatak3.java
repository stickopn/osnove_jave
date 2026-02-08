package selenium_uvod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Zadatak3 {
    static void main() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        ArrayList<String> pages = new ArrayList<>();
        pages.add("https://google.com/");
        pages.add("https://youtube.com/");
        pages.add("https://www.ebay.com/");
        pages.add("https://www.kupujemprodajem.com/");

        for (int i = 0; i < pages.size(); i++) {
            driver.navigate().to(pages.get(i));
            System.out.println(driver.getTitle());
        }

        driver.quit();
    }
}

//3. Zadatak
//Napisati program koji ima:
//        • Niz stranica (niz stringova) koje treba da učita. Niz je:
//        ○ https://google.com/
//        ○ https://youtube.com/
//        ○ https://www.ebay.com/
//        ○ https://www.kupujemprodajem.com/
//
//        • Program petljom prolazi kroz niz stranica i svaku stranicu učitava preko
//get ili navigate i od svake stranice na ekranu ispisuje naslov stranice.
//Kako od stranice pročitati naslov imate na ovom linku
//
//U prevodu u konzoli treba da se ispise:
//Google
//        YouTube
//Electronics, Cars, Fashion, Collectibles & More | eBay
//        KupujemProdajem
//
//• Zatvara pretraživač

