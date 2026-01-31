package p18_05_2022;

import java.util.Scanner;

public class RacunMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Racun posiljalac = new Racun();
        posiljalac.broj = "840-23932-323";
        posiljalac.vlasnik = "Milan Jovanovic";
        posiljalac.stanje = 1000;

        Racun primalac = new Racun();
        primalac.broj = "840-23932-555";
        primalac.vlasnik = "Dragan Draganovic";
        primalac.stanje = 2000;

        System.out.println("Posiljalac: " + posiljalac.vlasnik + ", " + posiljalac.broj + ", " + posiljalac.stanje);
        System.out.println("Primalac: " + primalac.vlasnik + ", " + primalac.broj + ", " + primalac.stanje);
        System.out.println("Unesite transakciju: ");
        int transakcije = s.nextInt();

        posiljalac.stanje = posiljalac.stanje - transakcije;
        primalac.stanje = primalac.stanje - transakcije;

        System.out.println("Posiljalac: " + posiljalac.vlasnik + ", " + posiljalac.broj + ", " + posiljalac.stanje);
        System.out.println("Primalac: " + primalac.vlasnik + ", " + primalac.broj + ", " + primalac.stanje);
    }
}
