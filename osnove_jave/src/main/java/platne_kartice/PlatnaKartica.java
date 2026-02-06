package platne_kartice;

public abstract class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    public PlatnaKartica() {
    }

    public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public void dodajSredstva(double iznos) {
        this.suma += iznos; // this.suma = this.suma + iznos;
    }

    public abstract void izvrsiTransakciju(double iznos);

    public abstract void stampaj();

}

//2. Zadatak
//
//Napraviti klasu PlatnaKartica koja ima:
//        • atribut suma – čuva trenutnu sumu novca na kartici u dolarima
//• atribut broj kartice – primer: 4012-1239-1221-3381
//        • atribut godina – godina do kada važi kartica
//• atribut mesec – mesec do kada važi kartica
//• konstruktor sa parametrima
//• gettere za sve atribute, bez settera
//• metodu dodajSredstva koja povećava sumu za unetu vrednost
//• metodu izvrsiTransakciju koja skida prosleđenu vrednost sa računa
//• metodu koja štampa podatke o kartici u formatu:
//        4012-1239-1221-3381, 11/2019, $212
//
//Napraviti klasu VisaKartica koja nasleđuje klasu PlatnaKartica:
//        • ovlašćeno lice, čuva se ime i prezime osobe koja ima ovlašćenje da podiže
//novac u ekspozituri
//• getter i setter za ovlašćeno lice
//• konstruktor sa parametrima
//• implementirati metodu izvrsiTransakciju, tako da na prosleđenu sumu dodaje
//proviziju od 1.8%. Najmanja provizija može biti $4.
//• implementirati metodu koja štampa podatke o kartici u formatu:
//Visa Card: 4012-1239-1221-3381, 11/2019, $212
