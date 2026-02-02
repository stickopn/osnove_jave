package p23_05_2022;

public class Film {
    private String naziv;
    private int godina;

//    Veza do drugog objekta, ne primitivan tip kao (string, double, int, boolean)
    private Reziser koJeRezirao;


    public Film() {

    }

    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return this.godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Reziser getKoJeRezirao() {
        return this.koJeRezirao;
    }

    public void setKoJeRezirao(Reziser koJeRezirao) {
        this.koJeRezirao = koJeRezirao;
    }

    public void stampaj() {
        System.out.println("Naziv filma je: " + this.naziv);
        System.out.println("Godina izdanja je: " + this.godina);
//        A moze i kroz this, zasto sto je vec tamo definisamo da ne mora ova dva reda ispod  this.koJeRezirao.stampaj(); da se pisu
        this.koJeRezirao.stampaj();
        System.out.println("Daj mi ime: " + this.koJeRezirao.getPunoIme());
        System.out.println("Starost: " + this.koJeRezirao.getStarost());
    }
}

//1. Zadatak
//
//Kreirati klasu Film koja ima:
//        • naziv filma
//• iz koje godine je film
//• reziser
//• konstruktore, gettere i settere koji su potrebni
//• metodu print koja štampa podatke u formatu:
//        naziv filma, godina
//Režirao je: ime prezime, starost.god
//
//Kreirati klasu Reziser koja ima:
//        • ime i prezime režisera
//• starost
//• konstruktore, gettere i settere koji su potrebni
//• metodu print koja štampa podatke u formatu:
//        ime prezime, starost.god
//
//U main metodi, kreirati jedan film i jednog režisera i pozvati svaku od metoda
