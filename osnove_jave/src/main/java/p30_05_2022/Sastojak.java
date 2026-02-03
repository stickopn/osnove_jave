package p30_05_2022;

public class Sastojak {
    private String naziv;
    private int cena;

    public Sastojak() {
    }

    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void stampa() {
        System.out.println(this.naziv +  ", " + this.cena + ".din");
    }
}

//1. Zadatak
//
//Kreirati klasu Sastojak koja ima:
//        • naziv
//• cenu
//• gettere i settere
//• konstruktore
//• metodu za štampanje koja štampa podatke u formatu:
//naziv - cena.din
//
//Kreirati klasu Pasta koja ima:
//        • niz sastojaka
//• metodu za dodavanje sastojka
//• (ostavite za kraj) metodu za brisanje sastojka. U metodu se šalje naziv
//sastojka koji se briše
//• defaultni konstruktor
//• metodu koja računa cenu paste, tako što sumira cene svih sastojaka
//• metodu za štampu koja štampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din

//U glavnom programu kreirati objekte i testirati funkcionalnosti
