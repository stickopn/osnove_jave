package p31_05_2022;
//OSNOVNA KLASA
public class Vozilo {
    //PROTEKTED MODIFIKATOR DAJE PRISTUP IZVEDENOJ KLASI (IZMEDJU PRIVATE I PUBLIC JE)
//    PROTECTED znaci: dozvoli pristup ovim atributima klasi koja mene nasledjuje
    protected String registracija;
    protected String marka;
    protected int brzina;
    protected int brojVrata;
    protected int kubikaza;
    protected int maxBrzina;


//    Defaultni konstruktor mora da se naglasi jer postoji i drugi sa parametrima, da nema ovaj drugi, onda defaultni bi se podrazumevao
//    kada se pozove iz izvedene klase
    public Vozilo() {
        System.out.println("Poziv konstruktora Vozilo.");
    }

    public Vozilo(String registracija, String marka, int brzina, int brojVrata, int kubikaza, int maxBrzina) {
        this.registracija = registracija;
        this.marka = marka;
        this.brzina = brzina;
        this.brojVrata = brojVrata;
        this.kubikaza = kubikaza;
        this.maxBrzina = maxBrzina;
    }

    public int getMaxBrzina() {
        return maxBrzina;
    }

    public void setMaxBrzina(int maxBrzina) {
        this.maxBrzina = maxBrzina;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public int getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }

    public void dodajGas() {
        this.brzina = this.brzina + 10;
        if (this.brzina > this.maxBrzina) {
            this.brzina = this.maxBrzina;
        }
    }

    public void stampaj() {
        System.out.println("Vozilo");
        System.out.println(this.brojVrata);
        System.out.println(this.registracija);
        System.out.println(this.brzina);
        System.out.println(this.marka);
        System.out.println(this.kubikaza);
        System.out.println(this.maxBrzina);
    }
}
