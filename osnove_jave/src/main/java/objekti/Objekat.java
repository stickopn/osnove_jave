package objekti;

public abstract class Objekat {
    protected String adresa;
    protected double povrsina;
    protected int zona;

    public Objekat() {
    }

    public Objekat(String adresa, double povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koeficijent() {
        if (zona == 1) {
            return 1.4;
        } else if (zona == 2) {
            return 1.1;
        } else {
            return 1.05;
        }
    }

    public abstract double racunajPorez();

    public abstract void stampaj();
}

//Zadatak 2. Kreirati apstraktnu klasu Objekat čiji su zaštićeni atributi:
//        - adresa (ulica i broj)
//- površina objekta
//- zona (1, 2 ili 3)
//- konstruktore, gettere i settere
//
//- metodu koja vraća koeficijent koji će se koristiti za računanje poreza u zavisnosti u kojoj
//zoni se nalazi objekat
//    - zona 1, koeficijent je 1.4
//        - zona 2, koeficijent je 1.1
//        - zona 3, koeficijent je 1.05
//        - apstraktnu metodu koja računa i vraća porez objekta
//- apstraktnu metodu stampaj

//Kreirati klasu Kuca koja nasleđuje klasu Objekat koja ima
//broj članova koji žive u tom objektu,
//
//        - konstruktore, gettere i settere
//- porez računa po formuli: koeficijent * površina
//- prepisati metodu stampaj tako da štampa sve podatke vezane za kuću
//
//
//Kreirati klasu Zgrada koja nasleđuje klasu Objekat koja ima
//
//- broj stanova
//- konstruktore, gettere i settere
//- porez računa po formuli: koeficijent * površina * broj stanova
//- prepisati metodu stampaj tako da štampa sve podatke vezane za zgradu
//
//Kreirati klasu Lokal koja nasleđuje klasu Objekat koja od metoda ima:
//
//        - konstruktore
//- porez računa po formuli: koeficijent * površina * 1.3
//        - prepisati metodu stampaj tako da štampa sve podatke vezane za lokal
//
//
//Kreirati klasu PoreskaUprava koja za atribute ima:
//
//        - ime grada u kom se nalazi
//- niz objekata
//- metodu dodaj objekat
//- metodu koja vraća objekat sa najvećim porezom
//- metodu koja vraća objekat sa najmanjim porezom
//- metodu koja računa ukupan porez za ceo grad
//- metodu koja štampa sve objekte
//
//
//U glavnom programu napraviti jednu poresku upravu i u nju dodati
//minimum 3 različita objekta i istestirati sve metode.