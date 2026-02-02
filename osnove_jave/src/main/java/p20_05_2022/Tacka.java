package p20_05_2022;

public class Tacka {
    //        1. Zad
//
//        Za klasu Tacka, koja ima atribute:
//• x – x koordinata
//• y – y koordinata
//• metodu stampaj
//• imamo difoltni konstruktor
//• imamo konstruktor koji prima obe koordinate za kreiranje objekta
//
//        U glavnom programu kreirati objekte

        public int x;
        public int y;
//        defaultni koskreutokr =, pisermo jer pravimo drugi
        public Tacka() {

        }

        public Tacka(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void stampaj() {
            System.out.println("x: " + x + ", y: " + y);
        }
}
