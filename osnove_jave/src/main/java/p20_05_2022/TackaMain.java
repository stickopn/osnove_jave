package p20_05_2022;

public class TackaMain {
    static void main() {
        Tacka a = new Tacka();
        a.x = 10;
        a.y = 11;

        a.stampaj();

        Tacka b = new Tacka(15, 18);
        b.stampaj();
    }
}
