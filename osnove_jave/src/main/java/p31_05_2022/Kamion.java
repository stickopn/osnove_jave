package p31_05_2022;
//IZVEDENA KLASA
public class Kamion extends Vozilo {
    private int nosivost;

    //Defaultni konstruktor koji mora da se zove isto kao i klasa
    public Kamion() {
        super(); // uvek se prvo izvrsava konstruktor osnovne klase, u ovom slucaju Vozilo, kako bi svako zauzeo svoju memoriju
//        super() se svakako podrazumeva, ne mora da se kuca, ali defaulni koji nema parametre
        System.out.println("Poziv konstruktora Kamion.");
    }

    public Kamion(String registracija,
                  String marka,
                  int brzina,
                  int brojVrata,
                  int kubikaza,
                  int maxBrzina,
                  int nosivost) {
        super(registracija, marka, brzina, brojVrata, kubikaza, maxBrzina);
        this.nosivost = nosivost;
    }

    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }

    @Override
    public void stampaj() {
        System.out.println("Kamion");
        System.out.println(this.brojVrata);
        System.out.println(this.registracija);
        System.out.println(this.brzina);
        System.out.println(this.marka);
        System.out.println(this.kubikaza);
        System.out.println(this.nosivost);
        System.out.println(this.maxBrzina);
    }

}
