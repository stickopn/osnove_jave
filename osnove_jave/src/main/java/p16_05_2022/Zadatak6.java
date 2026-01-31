package p16_05_2022;

import java.util.Scanner;

public class Zadatak6 {
//    6. Zadatak
//
//    Napisati metodu koja štampa N zvezdica u istom redu. Broj zvezdica je određen
//    parametrom N.
//
//    Ako se metoda pozove za N = 5, metoda štampa 5 zvezdica i enter
//    N = 5, print je => * * * * *
//
//    Ako se metoda pozove za N = 9, metoda štampa 9 zvezdica i enter
//    N = 9, print je => * * * * * * * * *
        static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Unesite vrednost:");
            int n = s.nextInt();
            star(n);
        }

        static void star(int n) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
}
