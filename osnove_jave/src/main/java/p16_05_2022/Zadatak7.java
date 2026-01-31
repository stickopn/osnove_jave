package p16_05_2022;

import java.util.Scanner;

public class Zadatak7 {
//    Apsolutna vrednost
        static void main(String[] args) {
            apsolutnaVrednost(-12);
            apsolutnaVrednost(7);
        }

        static void apsolutnaVrednost(int broj) {
            if (broj < 0) {
                System.out.println("Vrednost broja je: " + -broj);
            } else {
                System.out.println("Vrednost broja je: " + broj);
            }
        }
}
