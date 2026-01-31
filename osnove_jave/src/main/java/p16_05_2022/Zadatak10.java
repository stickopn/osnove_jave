package p16_05_2022;

public class Zadatak10 {
//    Napisati metodu koja vrši konverziju rimske u arapske brojeve.
//    1  - I
//    2  - II
//    3  - III
//    4  - IV
//    5  - V
//    6  - VI
//    7  - VII
//    8  - VIII
//    9  - IX
//    10 - X
    public static void main(String[] args) {
       int x = konvertuj( "II" );
       System.out.println(x);
    }

    static int konvertuj(String rimski) {
       if(rimski.equals("I")) {
           return 1;
       } else if (rimski.equals("II")) {
           return 2;
       } else {
           return 3;
       }
    }

}
