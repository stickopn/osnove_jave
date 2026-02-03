package p30_05_2022;

public class ReziserFilmovi {
    static void main() {
        Reziser r = new Reziser("Slobodan Kostic");

        Film roki1 = new Film("Roki 1", 1994);
        Film roki2 = new Film("Roki 2", 1996);
        Film roki3 = new Film("Roki 3", 2000);

        r.dodajFilm(roki1);
        r.dodajFilm(roki2);
        r.dodajFilm(roki3);

        r.stampaj();

        if (r.daLiJeReziraoFilm("Roki 1")) {
            System.out.println("Rezirao je roki.");
        } else {
            System.out.println("Nije rezirao roki.");
        }

    }


}
