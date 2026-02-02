package p20_05_2022;

public class KorisnikMain {
    static void main() {

//        Konstruktori su mehanizam koji nam omogucava da kreiramo neki objekat
//        Ovo "m" predstavlja adresu objekta gde je zauzet memorijski prostor, ako je null, to znaci da ne postoji objekat
//        za ovu promenljivu
        Korisnik m = new Korisnik();
        m.ime = "Slobodan";
        m.prezime = "Kostic";
        m.godine = 36;
//        nedefaultni konstruktor
        Korisnik r = new Korisnik("Slobodan", "Kostic", 36);

        Korisnik u = new Korisnik("Slobodan");
    }
}
