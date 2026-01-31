package p16_05_2022;

public class Zadatak11 {
//    Napisati funkciju koja vrši konverziju eura u dinare, rublje ili dolare prema dole navedenoj
//    konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno
//    izvršiti konverziju (RSD/USD/RUB) a vraća konvertovanu vrednost. U glavnom programu
//    pozvati funkciju za neki od primera.
//
//    Primer poziva funkcije:
//    Ako se za vrednost u eurima unese 3 i valuta RSD vraća vrednost 351.6339
//    Ako se za vrednost u eurima unese 4.5 i valuta USD vraća vrednost 5.31945
//
//    Primer izvršenja na programa:
//    Unesite vrednost u eurima: 3
//    Unesite valutu za konverziju: RSD
//3 EUR je 351.6339 RSD
//
//    Konverzija eura u druge valute:
//            1 EUR = 117.2113 RSD
//1 EUR = 1.1821 USD
    public static void main(String[] args) {
      double res = konvertuj(3, "USD");
      System.out.println(res);
    }

    static double konvertuj(double vrednostUEurima, String valuta) {
        if (valuta.equals("RSD")) {
            return vrednostUEurima * 117.2113;
        } else if (valuta.equals("USD")) {
            return vrednostUEurima * 1.1821;
        } else {
            return vrednostUEurima * 89.2323;
        }
    }
}
