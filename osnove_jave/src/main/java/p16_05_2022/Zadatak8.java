package p16_05_2022;

public class Zadatak8 {
//    Napisati metodu koja vraća suprotno negativni broj od prosleđenog.
//    Metoda prima broj N i vraća ga negativnu vrednost.
//            Primer:
//    Ako se metoda pozove za N = 10, vraća -10
//    Ako se metoda pozove za N = -11, vraća 11

    static void main(String[] args) {
        int x = suprotanBroj(0);
        System.out.println("Broj je uvek pozitivan " + x);
    }

    static int suprotanBroj(int a) {
        return -a;
    }
}
