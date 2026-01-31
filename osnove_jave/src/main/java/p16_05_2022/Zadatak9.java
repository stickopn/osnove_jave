package p16_05_2022;

public class Zadatak9 {
//    Napisati metodu koja proverava da li je trougao pravougli.
//    Metoda prima stranice trougla a, b i hipotenuzu trougla.
//    Ako je trougao pravougli onda vraća true, u suprotnom vraća false.
//
//    Trougao je pravougli ukoliko je a² + b² = c²

    static void main(String[] args) {
        boolean x = pravougliTrougao(3, 4, 5);
        if (x) {
            System.out.println("Jeste pravougli");
        } else {
            System.out.println("Nije pravougli");
        }
    }

    static boolean pravougliTrougao(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }
}
