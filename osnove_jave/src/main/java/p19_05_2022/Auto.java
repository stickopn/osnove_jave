package p19_05_2022;

public class Auto {
//    Kreirati klasu Auto koja ima:
//            • ime i prezime vozača
//• marku automobila
//• broj vrata
//• potrošnju na 100km (npr. 10)
//• trenutnu brzinu kojom se auto kreće
//• metodu za štampu koja štampa podatke u formatu:
//
//            [Vozac]
//            [Marka] - [br vrata]-ro vrata
//    Sa potrosnjom od [potrosnja] na 100km
//[Trenutna brzina auta] km/h je trenutna brzina.
//
//    Primer:
//    Milan Jovanovic
//    BMW - 5-ro vrata
//    Sa potrosnjom od 10l na 100km
//200 km/h je trenutna brzina

    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnjaNa100km;
    public int trenutnaBrzina;
    public String registracija;
    public boolean klimaUkljucena;
    public int godinaProizvodnje;
    public int registrovanDo;
    public int kubikaza;
    public double kapacitetRezervoara;
    public double trenutnoURezervoaru;

    public void stampaj() {
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaNa100km + " l na 100km");
        System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina.");
        System.out.println("Registracija: " + this.registracija);
    }

//    (Dopuna 2)
//    U okviru klase Auto, implementirati još 2 metode.
//            • metoda koja vraća informaciju da li je vozač prekoračio brzinu.
//    Kao parametar metode se prima ograničenje (kao broj) a metoda vraća
//  true ili false ako je trenutna brzina veća od ograničenja.
//• metoda koja vraća visinu novčane kazne za prekoračenje, za svaku
//    jedinicu prekoračenja plaća se 1000din. Metoda od parametara prima
//    ograničenje brzine.
//    U glavnom programu pozvati ove metode i odštampati neke poruke na osnovu
//    informacija koje dobijete od njih.

    public boolean prekoracenje(int ogranicenje) {
        return this.trenutnaBrzina > ogranicenje;
    }

    public int kazna(int ogranicenje) {
        if (this.prekoracenje(ogranicenje)) {
            return (this.trenutnaBrzina - ogranicenje) * 1000;
        }
        return 0;
    }

//    (Dopuna 3)
//    Dopuniti klasu Auto tako da ima:
//            • atribut broj registracije
//• da li je uključena klima u autu
//• metodu dodajGas, koja povećava trenutnu brzinu za 10
//            • metodu koci, koja smanjuje brzinu za 10. Brzina ne može da ode ispod nule
//• metodu koja računa i vraća trenutnu potrošnju auta. Metoda računa po formuli:
//            ○ faktor klime – ako je uključena klima faktor je 1.2, ako nije uključena onda je 1.0
//            ○ (trenutna brzina / 100.0 * potrošnja na 100km) * faktor klime

    public void dodajGas() {
        this.trenutnaBrzina = this.trenutnaBrzina + 10;
    }

    public void koci() {
        this.trenutnaBrzina = this.trenutnaBrzina - 10;
        if (this.trenutnaBrzina < 0) {
            this.trenutnaBrzina = 0;
        }
    }
    public double trenutnaPotrosnja() {
        if (this.klimaUkljucena) {
            return this.trenutnaBrzina / 100.0 * this.potrosnjaNa100km * 1.2;
        }
        return this.trenutnaBrzina / 100.0 * this.potrosnjaNa100km * 1.0;
    }

//    (Dopuna 4)
//    Dopuniti klasu Auto tako da ima:
//            • atribut godinu proizvodnje
//• atribut mesec do kad je registrovan auto (int)
//• atribut kubikaža auta (npr: 1600 - 5000)
//• metodu koja vraća da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//            • metodu koja vraća da li je istekla registracija. Metoda kao parametar prima trenutni
//    mesec i na osnovu toga vraća true ili false.
//            • metodu koja računa i vraća cenu registracije za auto. Za automobile do 2000 kubika
//    cena registracije je kubikaža * 100din, za automobile preko 2000 kubika dodatno se
//    uračunava 30% na cenu.

public boolean jeOldTimer() {
        return this.godinaProizvodnje < 1950;
}

public boolean isteklaRegistracija(int trenutniMesec) {
        return trenutniMesec > this.registrovanDo;
}

public double cenaRegistracije() {
        if (this.kubikaza < 2000) {
            return this.kubikaza * 100;
        }
        return this.kubikaza * 100 * 1.3;
}

//            (Dopuna 5)
//    Dopuniti klasu Auto tako da ima:
//            • kapacitet rezervoara
//• trenutnu količinu goriva u rezervoaru (u litrima)
//• metodu natoči gorivo, metoda prima kao parametar litražu goriva koja se toči a vraća
//    novčanu vrednost goriva. Litar goriva je 170din. Vodite računa da trenutna količina
//    goriva ne pređe kapacitet rezervoara, takođe ukoliko se unese količina koja prelazi
//    kapacitet, tu količinu koja prelazi ne računate u cenu.

  public double natociGorivo(double listrazaGoriva) {
        if (this.trenutnoURezervoaru + listrazaGoriva <= this.kapacitetRezervoara) {
            return listrazaGoriva * 170;
        } else {
            return (this.kapacitetRezervoara - this.trenutnoURezervoaru) * 170;
        }
  }

}
