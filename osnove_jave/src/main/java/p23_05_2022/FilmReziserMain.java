package p23_05_2022;

public class FilmReziserMain {
    static void main() {
        Film film = new Film();
        film.setGodina(1990);
        film.setNaziv("Neki film");

//        A mozemo i bez set-era samo da dodelimo vrednosti kroz konstruktor

        Film noviFilm = new Film("Neki film 2" , 1991);
//        noviFilm.stampaj();

        Reziser reziser = new Reziser();
        reziser.setPunoIme("Slobodan Kostic");
        reziser.setStarost(36);
        reziser.stampaj();
//        Prenos parametra po referenci
        film.setKoJeRezirao(reziser);
        System.out.println();
        film.stampaj();
    }
}
