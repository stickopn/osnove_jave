package p14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class KatalonLoginTests {
    private WebDriver driver;
    private String baseUrl = "https://cms.demo.katalon.com";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        this.driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    @Test(priority = 10)
    public void VisitLoginPageFromNavBar() {
        driver.findElement(By.linkText("MY ACCOUNT")).click();
        Assert.assertEquals(driver.getTitle(),
                "My account – Katalon Shop",
                "Page title does not contain 'My account – Katalon Shop'");
        Assert.assertTrue(driver.getCurrentUrl().contains("/my-account"),
                "Url does no 'my-account/'");
    }

    @Test(priority = 20)
    public void CheckInputTypes() {
        driver.get(baseUrl + "/my-account");
        Assert.assertEquals(
                driver.findElement(By.id("username")).getAttribute("type"),
                "text",
                "Email input nema valid type.");

        Assert.assertEquals(
                driver.findElement(By.id("password")).getAttribute("type"),
                "password",
                "Password input nema valid type.");

        Assert.assertEquals(
                driver.findElement(By.id("rememberme")).getAttribute("type"),
                "checkbox",
                "Checkbox input nema valid type.");

        Assert.assertFalse(
                driver.findElement(By.id("rememberme")).isSelected(),
                "Rememberme trebalo bi da bude unchecked.");
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}

//1. Zadatak
//
//Kreirati klasu KatalonLoginTests za testove
//Base url: https://cms.demo.katalon.com/
//
//Test #1: Visit login page from Nav bar
//
//Koraci:
//
//Učitati stranicu home stranicu
//
//Kliknuti na My account link
//
//Verifikovati da je naslov stranice My account – Katalon Shop
//
//Verifikovati da se u url-u stranice javlja my-account/
//
//Za sve validacije ispisati odgovarajuće poruke u slučaju greške
//
//Test #2: Check input types
//
//Koraci:
//
//Učitati my-account stranicu
//
//Verifikovati da polje za unos email-a za atribut type ima vrednost text
//
//Verifikovati da polje za unos lozinke za atribut type ima vrednost password
//
//Verifikovati da checkbox Remember me za atribut type ima vrednost checkbox
//
//Verifikovati da je Remember me checkbox dečekiran. Koristan link kako naći informaciju da li je checkbox čekiran ili ne.
//
//Za sve validacije ispisati odgovarajuće poruke u slučaju greške