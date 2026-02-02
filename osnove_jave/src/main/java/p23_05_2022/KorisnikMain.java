package p23_05_2022;

public class KorisnikMain {
    static void main() {

        Korisnik m = new Korisnik("Slobodan", "Kostic", 36, "stickopn@gmail.com");

        System.out.println(m.getIme() + " " + m.getPrezime());
        m.setIme("Tamara");
        m.setPrezime("Kostic2");

        System.out.println(m.getIme() + " " + m.getPrezime());
    }
}
