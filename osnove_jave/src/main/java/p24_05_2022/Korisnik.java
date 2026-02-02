package p24_05_2022;

public class Korisnik {
    private String punoIme;
    private String licenca;

    public Korisnik() {
        this.licenca = "basic";
    }

    public Korisnik(String punoIme) {
        this.punoIme = punoIme;
        this.licenca = "basic";
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getLicenca() {
        return licenca;
    }

    public void pretplatiSe(int uplata) {
        if (uplata == 100) {
            this.licenca = "pro";
        } else if (uplata == 150) {
            this.licenca = "premium";
        }
    }

    public void ponistiPretplatu() {
        this.licenca = "basic";
    }

    public int maksimalnaDuzinaPoziva() {
        if (this.licenca.equals("basic")) {
            return 40;
        } else if (this.licenca.equals("pro")) {
            return 240;
        } else if (this.licenca.equals("premium")) {
            return 1440;
        }
        return 0;
    }

    public void stampaj() {
        System.out.println(this.punoIme);
    }
}

//Kreirati klasu Korisnik koja ima:
//        • ime i prezime
//• tip licence (basic / pro / premium)
//• konstruktore. Po difoltu korisnik ima basic licencu
//• gettere i settere za sve atribute, sem za tip licence koja ne može da se menja
//• metodu pretplate koja postavlja licencu u zavisnosti od uplaćene sume:
//        ○ ako je uplata 100, postavlja licencu na "pro"
//        ○ ako je uplata 150, postavlja licencu na "premium"
//Metoda kao parametar prima vrednost uplate $100 ili $150
//• metodu ponisti pretplatu koja postavlja licencu na basic
//• metodu koja vraća maksimalnu dužinu trajanja video poziva u zavisnosti od licence:
//        ○ ako je basic, vraća 40min
//    ○ ako je pro, vraća 240min
//    ○ ako je premium, vraća 1440min
//• metodu za štampu koja štampa u formatu:
//ime i prezime
//
//Kreirati klasu ZoomCall koja ima:
//        • link za poziv
//• password
//• korisnika koji je host
//• korisnika koji je guest
//• gettere za sve atribute
//• setter samo za guest-a
//• metodu pokreni poziv koja štampa podatke u formatu:
//Zoom Call: url
//Password: password
//Host: ime i prezime
//Guest: ime i prezime
//Maksimalno trajanje poziva je (broj minuta) min
//
//Maksimalno trajanje poziva se čita od korisnika koji je host!
//
//U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija
