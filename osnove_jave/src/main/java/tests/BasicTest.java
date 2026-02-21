package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.NavPage;
import pages.ProductPage;

import java.time.Duration;

public abstract class BasicTest {
//    Ova klasa ce sadrzati sve ono sto imaju drugi testovi

//    Postavljamo promenljive u protected ne vise u private kako bi ih nasledeli u drugoj klasi
    protected WebDriver driver;
//    protected String baseUrl = "https://cms.demo.katalon.com";
    protected NavPage navPage;
    protected CartPage cartPage;
    protected ProductPage productPage;

    protected String getBaseUrl() {
        return "https://cms.demo.katalon.com";
    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        this.driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        this.cartPage = new CartPage(driver);
        this.navPage = new NavPage(driver);
        this.productPage = new ProductPage(driver);
    }
    @BeforeMethod
    public void beforeMethod() {
        driver.get(getBaseUrl());

    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }
    @AfterMethod
    public void  afterMethod() {
    }
}
