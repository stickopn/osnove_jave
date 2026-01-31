package p18_05_2022;

public class MainKorisnik {
    public static void main(String[] args) {

//        Promenljiva k je objekat klase Korisnik - OOP
        Korisnik k = new Korisnik();
        k.ime = "Slobodan";
        k.prezime = "Kostic";
        k.godine = 36;

        System.out.println("Ime " + k.ime);

    }
}
