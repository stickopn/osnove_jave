package p30_05_2022;

public class Reakcija {
    private String tip;
    private String korisnik;

    public Reakcija() {
    }

    public Reakcija(String tip, String korisnik) {
        this.tip = tip;
        this.korisnik = korisnik;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }
}

//2. Zadatak
//
//Kreirati klasu Reakcija koja ima:
//        • tip reakcije (smajli, like, srce)
//• ime i prezime korisnika koji je reagovao
//• gettere, settere i konstruktore
//
//Kreirati klasu FacebookPost koja ima:
//        • ime i prezime korisnika koji je stavio oglas
//• tekst objave
//• niz reakcija
//• metodu reaguj, koja dodaje reakciju u niz
//• (modifikacija za vežbu) Ukoliko se desi situacija da jedan isti korisnik
//reaguje na post (tj. postoji reakcija korisnika sa istim imenom i prezimenom)
//izbaciti prethodnu reakciju i ubaciti novu.
//
//Primer:
//Milan – lajkuje
//Nemanja – lajkuje
//Milan – daje srce
//
//Post ima lajk od Nemanje i srce od Milana.
//• privatnu metodu koja vraća broj reakcija određenog tipa
//        (prosleđuje se tip reakcije koji može da bude smajli, like ili srce)
//• metodu stampaj koja štampa podatke u formatu:
//ime i prezime
//tekst objave
//Smajli 10 | Like 15 | Srce 2
