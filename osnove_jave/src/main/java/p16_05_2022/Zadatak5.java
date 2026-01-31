package p16_05_2022;

public class Zadatak5 {
    public static void main(String[] args) {

//        Napisati funkciju koja štampa zbir, razliku, proizvod i količnik za dva prosleđena broja.
//        Brojevi su ulazni parametri funkcije. U glavnom programu pozvati nekoliko puta funkciju
//        sa različitim prosleđenim vrednostima.
        int x = 10;
        int y = 5;
        operacije(x, y);
        int c = 4;
        int d = 2;
        operacije(c, d);
    }

    static void operacije(int a, int b) {
        System.out.println("Zbrir je: " + (a + b));
        System.out.println("Razlika je: " + (a - b));
        System.out.println("Kolicnik je: " + (a / b));
        System.out.println("Proizvod je: " + (a * b));
    }
}
