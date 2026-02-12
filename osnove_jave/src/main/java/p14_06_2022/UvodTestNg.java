package p14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class UvodTestNg {
//    ANOTACIJE
//    visitsTheLoginUrl - naziv za metodu

//    Koristi se kada zelimo da podesimo okruzenje za testiranje,
//    npr. brisanje korisnika ili azuriranje necega, npr sql upit za kreiranje 100 korisnika
//    koji ce da nam sluzi za dalje testiranje ili ako radimo sa nekim fajlovima da ih tu uploadujemo

    private WebDriver driver;
    private String baseUrl = "https://www.google.com";

//    baseUrl plus dopuna  driver.get(baseUrl + "/search?q=Milan");

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        this.driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//    Sve sto se nalazi ispod @Test ove anotacije, kaze Test NG biblioteci da je ispod test, odnosno da
//    metodu ispod smatra za izvrsenje testova, a ne obicna metoda kao sto bi bio slucaj bez ove anotacije

//    Ova anotacija se zove pre svakog testa u ovoj klasi i ova klasa ne moze da se izvrsi ako nema
//    nijeda test
//    npr moze da se iskoristi u testu gde treba pre promene lozinke da se korisnik prvo uloguje
//    i to moze da se kroz before odradi pre testa

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    @Test(priority = 1)
    public void googleTitleTest() {
//        if (driver.getTitle().equals("Google")) {
//            System.out.println("Ok");
//        } else {
//            System.out.println("Nije ok");
//        }
//        Umesto if/else koristi se Assert iz NG biblioteke
        Assert.assertEquals(
                driver.getTitle(),
                "Google",
                "Poruka koja se prikaze ako test ne prodje");
//        Drugi nacin za gornju proveru
//        Assert.assertTrue(driver.getTitle().contains("Google"), "Poruka");

        String actualSearchType = driver.findElement(By.name("q")).getAttribute("type");
//        Treci parametar je poruka koja se prikaze kada je pao test
        Assert.assertEquals(
                actualSearchType,
                "textarea",
                "[ERROR] Search poruka koja se prikazuje kada je test pao");
//        Prvi nacin da test padne je fail u proveri
//        Drugi nacin da test fejluje ukoliko ne pronadje neki element npr. By.name("q")

    }

//    Ukoliko ne stavimo prioritet po testu, onda ide po abecedi Test metode
    @Test(priority = 2)
    public void googleUrlTest() {
            if (driver.getCurrentUrl().equals("https://www.google.com/")) {
                System.out.println("Ok");
            } else {
                System.out.println("Nije ok");
            }
    }

//    Metoda koja se zove posle svakog testa
//    Ukoliko test fejluje hocemo da napravimo screenshot stranice i za to najcesce se koristi ova metoda
    @AfterMethod
    public void afterMethod() {
        System.out.println("AFTER METHOD");
    }

//    Metoda koja se izvrsava na kraju svih testova
//    After sluzi za ciscenje sveka iz Before klase ako smo tamo nesto radili
    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}

//Tests
//Login Tests
//Test #1: Visits the login url
//
//Koraci:
//
//Učitati /login stranu
//
//Verifikovati da se u url-u stranice javlja ruta /login
//
//Test #2: Checks input types
//
//Koraci:
//
//Učitati /login stranu
//
//Verifikovati da polje za unos emaila za atribut type sadrži vrednost email
//
//Verifikovati da polje za unos lozinke za atribut type sadrži vrednost password
//
//Test #3: Displays errors when user does not exist
//
//Podaci:
//
//email: non-existing-user@gmail.com
//
//password: password123
//
//Koraci:
//
//Učitati /login stranu
//
//Postaviti EN jezik stranice