package figure;

public abstract class Figura {
    public abstract double povrsina();
    public abstract double obim();

    public void stampaj() {
        System.out.println("Povrsina: " + this.povrsina());
        System.out.println("Obim: " + this.obim());
    }
}

//Kreirati apstraktnu klasu Figura koja ima:
//        • apstraktnu metodu povrsina
//• apstraktnu metodu obim
//• metodu koja štampa podatke u formatu:
//Povrsina je (povrsina)
//Obim je (obim)
//
//Kreirati klasu JednakostranicniTrougao koja nasleđuje klasu Figura:
//        • stranicu a
//• gettere/settere/konstruktore
//• implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//        • implementira metodu obim
//
//Kreirati klasu Pravougaonik koja nasleđuje klasu Figura:
//        • stranice a i b
//• gettere/settere/konstruktore
//• implementira metodu povrsina
//• implementira metodu obim
//
//U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika),
//zatim sabrati sve povrsine i obime i za svaku figuru ispisati ponaosob
