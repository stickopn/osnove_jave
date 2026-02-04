package osoba_student_profesor;

public class Osoba {
    protected String punoIme;
    protected String jmbg;

    public Osoba(String punoIme, String jmbg) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
    }

    public void stampaj() {
        System.out.println(this.punoIme + ", jmbg " + this.jmbg);
    }
}

//1. Zadatak
//
//Kreirati klasu Osoba koja od atributa ima:
//        • ime i prezime
//• jmbg
//• konstruktor sa parametrima
//• metodu stampaj koja štampa podatke u formatu:
//        ime prezime, jmbg
//
//Kreirati klasu Student koja nasleđuje klasu Osoba,
//koja od dodatnih atributa ima:
//        • broj indeksa
//• dug za školarinu
//• konstruktor sa parametrima
//• metodu uplati skolarinu koja umanjuje dug za prosleđenu vrednost.
//Metoda prima iznos uplate kao parametar metode
//• Napisati implementaciju metode stampaj da štampa sve podatke o studentu
//Kreirati klasu Profesor koja nasleđuje klasu Osoba,
//koja od dodatnih atributa ima:
//        • naziv predmeta koji predaje
//• iznos plate
//• konstruktor sa parametrima
//• metodu poveća platu. Metoda kao parametar prima procenat povećanja.
//        • Napisati implementaciju metode stampaj da štampa sve podatke o profesoru
//
//U glavnom programu kreirati 2 studenta i 2 profesora.
