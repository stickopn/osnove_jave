package p31_05_2022;
//OSNOVNA KLASA
// abstract znaci da ona ne moze da se koristi u VoziloMain i da joj se dodeljuju parametri, zato sto je ona osnovna klasa
//i koristi se samo za izvedene klase "new Vozilo" znaci ne moze da mu se dodele parametri u Main-u
public abstract class Vozilo {
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

//    Stavljamo da bude abstract, zato sto se u svakoj izvedenoj klasi overajduje i abstraktnoj metodi ne treba telo metode
//    zato se odmah zatvara. Sto znaci da ova metoda nema neku logiku vec je napisana samo da postoji, jer izvedene klase
//    trebaju da imaju logiku za stampu.

    public abstract void stampaj();
}

//Ukoliko neka klasa ima apstraktnu metodu ta klasa je automatski abstraksna,
//dok ne mora metoda da bude ukoliko je klasa abstraktna a metoda nije!
//Ali u izvedenim klasama mora da se overajduje metoda ili ce da izbacuje gresku,
//da ti ponudi da ubacis overajd ili da ta klasa isto bude abstraktna
