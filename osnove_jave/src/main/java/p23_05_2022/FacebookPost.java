package p23_05_2022;

public class FacebookPost {
    private String opis;
    private FacebookKorisnik autor;

    public FacebookPost() {
    }

    public FacebookPost(String opis, FacebookKorisnik autor) {
        this.opis = opis;
        this.autor = autor;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public FacebookKorisnik getAutor() {
        return autor;
    }

    public void setAutor(FacebookKorisnik autor) {
        this.autor = autor;
    }

    public void stampaj() {
        if (this.autor != null) {
            this.autor.stampaj();
        }
        System.out.println("Opis: " + this.opis);
    }
}
