package p16_05_2022;

public class MetodeUvod {
    static void main() {
        myMethod();
        myMethod();

        int a = 10;
        int b = 11;
        int x = suma(a, b);
        System.out.println(x);
    }

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    // void => ne vracamo nista
    // int, String, double, float, boolean, ... ArrayList<Integer>
    // metoda samo moze da vrati jednu vrednost, po tipu koji je naveden
    //    primer za sumu

    static int suma(int a, int b) {
        int s = a + b;
        System.out.println("I just got executed!");
        return s;
    }

    //    primer za apsolutnu vrednost

//    static void main(String[] args) {
//        int x = apsolutnaVrednost(-10);
//        System.out.println("Aps je: " + x);
//    }
//
//    static int apsolutnaVrednost(int broj) {
//        if (broj < 0) {
//            return -broj;
//        } else {
//            return broj;
//        }
//    }

//    static void main(String[] args) {
//        String pIme = spojiImeIPrezime("Slobodan", "Kostic");
//        System.out.println(pIme);
//    }
//
//    static String spojiImeIPrezime (String ime, String prezime) {
//        String punoIme = ime + " " + prezime;
//        return  punoIme;
//    }

//    Da li su brojevi jednaki

    static void main(String[] args) {
      boolean x = daLiSuBrojeviJednaki(10, 10);
      System.out.println("Da li su brojevi jednaki: " + x);
    }

    static boolean daLiSuBrojeviJednaki (int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
