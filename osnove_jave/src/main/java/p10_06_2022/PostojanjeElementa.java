package p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PostojanjeElementa {
    static void main() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Implicitni wait i pravi se na nivou celog projekta i pise se samo na jedno mesto
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Ovo je vreme za cekanje da se stranica ucita
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        driver.get("file:///C:/Users/LEGION/Desktop/Zadatak6.html");
        driver.findElement(By.id("showInBtn")).click();
        try {
            driver.findElement(By.id("id-0"));
            System.out.println("Nasao je element.");
        } catch (Exception e) {
            System.out.println("Nije nasao.");
        }
//        Prvi nacin da se proveri da li neki element postoji na stranici jeste uz pomoc try / catch metode
//        boolean elementExist = true;
//        try {
//            driver.findElement(By.id("id-0"));
//        } catch (Exception e) {
//            elementExist = false;
//        }
//        System.out.println(elementExist);

//        Prvo trazenje
        if (elementExist(driver, By.id("id-0"))) {
            System.out.println("Nesto");
        }

//        Drugo trazenje - koristeci listu - ako nema vraca praznu listu ne puca
        List<WebElement> elements = driver.findElements(By.id("id-0"));
        if (elements.size() > 0) {
            System.out.println("Element postoji");
        } else {
            System.out.println("Ne postoji");
        }
        System.out.println(elements.size());


        System.out.println("KRAJ");
        driver.quit();

    }
    //        Ali mogli smo zbog cestog koricenja te metode da napravimo jednu koju mozemo korstiti vise puta

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

//Ovo je kod po kome sam trazio id elemente
//        <!DOCTYPE html>
//<html lang="sr">
//<head>
//    <meta charset="UTF-8">
//    <title>Zadatak6</title>
//
//<style>
//body {
//    margin: 0;
//    font-family: Arial, sans-serif;
//}
//
//button {
//    margin: 5px;
//}
//
//        .item {
//    background: orange;
//    color: white;
//    font-size: 40px;
//    padding: 5px 10px;
//}
//    </style>
//</head>
//<body>
//
//<button id="showInBtn" onclick="myFunction()">Show in</button>
//
//<script>
//        let counter = 0; // da bi prvi bio id-0
//
//function myFunction() {
//    // random kasnjenje 1–10 sekundi
//    let delay = Math.floor(Math.random() * 9000) + 1000;
//
//    console.log("number1", delay);
//
//    setTimeout(function () {
//        let div = document.createElement("div");
//        div.className = "item";
//        div.id = "id-" + counter;   // id-0, id-1, id-2...
//        div.innerHTML = "IT Bootcamp";
//
//        document.body.appendChild(div);
//        counter++;
//    }, delay);
//}
//</script>
//
//</body>
//</html>
