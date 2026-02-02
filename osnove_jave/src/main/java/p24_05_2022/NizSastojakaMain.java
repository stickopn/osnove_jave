package p24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class NizSastojakaMain {
    static void main() {
        Scanner s = new Scanner(System.in);

        ArrayList<Sastojak> sastojci = new ArrayList<>();
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite naziv: ");
            String naziv = s.next();
            System.out.println("Unesite cenu: ");
            int cena = s.nextInt();

            Sastojak x = new Sastojak(naziv, cena);
            sastojci.add(x);
        }

        int suma = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            suma = suma + sastojci.get(i).getCena();
            sastojci.get(i).stampaj();
            System.out.println("Suma sastojaka je: " + suma);
//            System.out.println(sastojci.get(i).getNaziv());
//            System.out.println(sastojci.get(i).getCena());
        }
//        Sastojak s1 = new Sastojak("brasno", 100);
//        Sastojak s2 = new Sastojak("secer", 150);
//
//        sastojci.add(s1);
//        sastojci.add(s2);
    }
}
