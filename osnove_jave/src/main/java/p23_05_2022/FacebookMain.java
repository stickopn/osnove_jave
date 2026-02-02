package p23_05_2022;

public class FacebookMain {
    static void main() {

//        Setter
        FacebookPost post = new FacebookPost();
        post.setOpis("Hello!");

        FacebookKorisnik a = new FacebookKorisnik();
        a.setIme("Milan");
        a.setPrezime("Jovanovic");

        post.setAutor(a);

        post.stampaj();

//        Drugi nacin pozivanja

        FacebookKorisnik k = new FacebookKorisnik("Milan", "Jovanovic");

        FacebookPost p = new FacebookPost("Opis neki!", k);

        p.stampaj();

    }
}
