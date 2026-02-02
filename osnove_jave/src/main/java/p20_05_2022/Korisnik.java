package p20_05_2022;

public class Korisnik {
    public String ime;
    public String prezime;
    public int godine;

//    Ovde se pravi KONSTRUKTOR koji se ne vidi i zove se isto kao klasa
//    nemamo za konstruktor povratni tip kao sto je void, zato sto prilikom kreiranja objekta new Korisnik()
//    samo se zauzme memorija i ono sto se vrati jeste adresa od zauzetog prostora
//    jer sve sto treba mozes tamo na toj adresi da vidis
//    defaultni konstruktor
//    Defaultni konstruktor se podrazumeva jedinko ako ne postoji neki drugi
//    i moramo i defaultni da ubacimo ukoliko smo ubacili u ovom slucaju i ova dva ispod
    public Korisnik(){

    }
//    nedifolni konstrruktor je onaj koji ima parametre
        public Korisnik(String ime, String prezime, int godine){
            this.ime = ime;
            this.prezime = prezime;
            this.godine = godine;
    }

    public Korisnik(String ime) {
        this.ime = ime;
    }
}
