package platne_kartice;

public class MasterKartica extends PlatnaKartica {
    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }

    @Override
    public void izvrsiTransakciju(double iznos) {
        double provizija = iznos * 1.5 / 100.0;
        this.suma = this.suma - iznos - provizija;
    }

    @Override
    public void stampaj() {
        System.out.print("Master Card: ");
        System.out.print(this.mesec + "/" + this.godina + ", ");
        System.out.println("$" + this.suma + ", " + this.brojKartice);
    }

    public void naplatiOdrzavanje() {
        this.suma -= 2;
    }
}
