package p24_05_2022;

public class FizickoLice {
    private String punoIme;
    private String brLk;
    private String jmbg;
    private boolean vecKupovao;

//    Posto jmbg ne sme da se menja izbacili smo seter i zato u defaultnom konstruktoru smo morali da dodamo jmbg
//    na pocetku i moras da uneses jmbg jer kasnije neces moci, a ostalo kako ti volja

    public FizickoLice(String jmbg) {
        this.jmbg = jmbg;
    }

    public FizickoLice(String punoIme, String brLk, String jmbg, boolean vecKupovao) {
        this.punoIme = punoIme;
        this.brLk = brLk;
        this.jmbg = jmbg;
        this.vecKupovao = vecKupovao;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getBrLk() {
        return brLk;
    }

    public void setBrLk(String brLk) {
        this.brLk = brLk;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isVecKupovao() {
        return vecKupovao;
    }

    public void setVecKupovao(boolean vecKupovao) {
        this.vecKupovao = vecKupovao;
    }

    public void stampaj() {
//        Interpolacija termin za spajanje, prebaci za prvi %s vrednost this.punoIme, za durgi %s this.brLk
        System.out.println(String.format("Ime: %s, broj licne karte: %s", this.punoIme, this.brLk));
    }
}

//2. Zadatak
//
//Za potrebe agencije za nekretnine kreirati klasu FizickoLice koje ima:
//        • ime i prezime
//• broj lične karte
//• jmbg
//• podatak da li je osoba već jednom kupovala nekretninu preko agencije (boolean)
//• konstruktore
//• gettere i settere, jmbg ne sme da se menja
//• metodu stampaj, koja štampa podatke u formatu:
//ime i prezime, broj lične karte
//
//Kreirati klasu Ugovor koja ima:
//        • godinu, dan i mesec sklapanja ugovora
//• osobu koja prodaje nekretninu (fizičko lice)
//• osobu koja kupuje nekretninu (fizičko lice)
//• cenu za koju se prodaje nekretnina
//• adresu nekretnine (ulica br., grad)
//• metodu koja vraća procenat zarade
//    ○ za osobu koja je već kupovala nekretninu preko agencije je 0.02
//        ○ za one koji nisu 0.03
//        • metodu koja računa zaradu agencije pri prodaji nekretnine koja uključuje
//poreze, takse i usluge agencije, prema formuli:
//        1000 + cena za koju se prodaje * procenat zarade
//• metodu koja štampa ugovor u formatu:
//Dana (dan.mesec.godina) god sklopljen je ugovor između (print prodavca) i
//        (print kupca) o kupovini nekretnine (adresa) po ceni od (cena nekretnine)
//pri čemu je kupac u obavezi da agenciji isplati novčanu vrednost u iznosu od
//        (zarada agencije)
