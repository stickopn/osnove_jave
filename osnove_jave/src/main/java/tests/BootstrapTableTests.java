package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.DeleteDialogPage;
import pages.EditDialogPage;
import pages.TablePage;

import java.time.Duration;

public class BootstrapTableTests extends BasicTest {
//    private WebDriver driver;
//    private String baseUrl = "https://s.bootsnipp.com/iframe/K5yrx";
//    Atributi
    private TablePage tablePage;
    private EditDialogPage editDialogPage;
    private DeleteDialogPage deleteDialogPage;

    @BeforeMethod
    public void setupPages() {
        tablePage = new TablePage(driver);
        editDialogPage = new EditDialogPage(driver);
        deleteDialogPage = new DeleteDialogPage(driver);
    }

    @Override
    protected String getBaseUrl() {
        return "https://s.bootsnipp.com/iframe/K5yrx";
    }

    @Test(priority = 1)
    public void editRow() {
        this.tablePage = new TablePage(driver);
        this.editDialogPage = new EditDialogPage(driver);
        this.deleteDialogPage = new DeleteDialogPage(driver);
//        tablePage.getEditButtonByRowIndex(0).click();
        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com");
        tablePage.getEditButtonByRowIndex(0).click();
        editDialogPage.waitForDialogToBeVisible();
        editDialogPage.getFirstNameInput().clear();
        editDialogPage.getFirstNameInput().sendKeys("Slobodan");
        editDialogPage.getLastNameInput().clear();
        editDialogPage.getLastNameInput().sendKeys("Kostic");
        editDialogPage.getMiddleNameInput().clear();
        editDialogPage.getMiddleNameInput().sendKeys("Dragan");
        editDialogPage.getUpdateButton().click();
        editDialogPage.waitForDialogToBeInvisible();

        Assert.assertEquals(
                tablePage.getTableCell(0, 1).getText(),
                "Slobodan",
                "Uneseno ime nije azurirano"
        );
        Assert.assertEquals(
                tablePage.getTableCell(0, 2).getText(), "Kostic"
        );
        Assert.assertEquals(
                tablePage.getTableCell(0, 3).getText(), "Dragan"
        );
    }

    @Test(priority = 2)
    public void deleteRow() {
        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com");
        tablePage.getDeleteButtonByRowIndex(0).click();
        deleteDialogPage.waitForDialogToBeVisible();
        deleteDialogPage.getDeleteButton().click();
        deleteDialogPage.waitForDialogToBeInvisible();

//        Assert.assertEquals(
//                tablePage.getRows().size(),
//                1
//        );
//        Umesto gornjeg Asserta, moze i ovako

        tablePage.waitForNumberOfRowsToBe(2);
    }

}

//1. Zadatak
//Kreirati BootstrapTableTests klasu koja ima:
//Base url: https://s.bootsnipp.com
//
//Test #1: Edit Row
//First Name: ime polaznika
//Last Name: prezime polaznika
//Middle Name: srednje ime polaznika
//
//Koraci:
//Učitati stranu /iframe/K5yrx
//Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
//Klik na Edit dugme prvog reda
//Sačekati da dijalog za Editovanje bude vidljiv
//Popuniti formu podacima
//Biće potrebno da pre unosa teksta pobrišete tekst koji već postoji, za to se koristi metoda clear. Koristan link
//Klik na Update dugme
//Sačekati da dijalog za Editovanje postane nevidljiv
//Verifikovati da se u First Name ćeliji prvog reda tabele javlja uneto ime
//Verifikovati da se u Last Name ćeliji prvog reda tabele javlja uneto prezime
//Verifikovati da se u Middle Name ćeliji prvog reda tabele javlja uneto srednje ime
//Za sve validacije ispisati odgovarajuće poruke u slučaju greške
//Test #2: Delete Row
//Podaci:
//First Name: ime polaznika
//Last Name: prezime polaznika
//Middle Name: srednje ime polaznika
//
//Koraci:
//Učitati stranu /iframe/K5yrx
//Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
//Klik na Delete dugme prvog reda
//Sačekati da dijalog za brisanje bude vidljiv
//Klik na Delete dugme iz dijaloga
//Sačekati da dijalog za Editovanje postane nevidljiv
//Verifikovati da je broj redova u tabeli za jedan manji
//Za sve validacije ispisati odgovarajuće poruke u slučaju greške
//
//Test #3: Take a Screenshot
//Koraci:
//Učitati stranu /iframe/K5yrx
//Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
//Kreirati screenshot stranice. Koristan link:
//https://www.guru99.com/take-screenshot-selenium-webdriver.html
//Fajl čuvajte na putanji gde su vam bile slike od prošlog domaćeg. Na putanji:
//src/main/resources/nazivslike.png