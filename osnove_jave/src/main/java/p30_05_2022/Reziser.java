package p30_05_2022;

import java.util.ArrayList;

public class Reziser {
    private String punoIme;
//    Za nizove se u praksi ne pravi geter i seter
    private ArrayList<Film> filmovi = new ArrayList<>();

    public Reziser() {

    }

    public Reziser(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public void dodajFilm(Film film) {
        this.filmovi.add(film);
    }

    public void stampaj() {
        System.out.println("Reziser: " + this.punoIme);

        for (int i = 0; i < this.filmovi.size(); i++) {
            System.out.println(
                    this.filmovi.get(i).getNaziv() + ", " +
                            this.filmovi.get(i).getGodina()
            );
        }
    }

    public boolean daLiJeReziraoFilm (String nazivFilma) {
        for (int i = 0; i < filmovi.size(); i++) {
            if (this.filmovi.get(i).getNaziv().equals(nazivFilma)) {
                return true;
            }
        }
        return false;
    }
}
