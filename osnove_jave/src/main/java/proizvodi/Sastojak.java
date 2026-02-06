package proizvodi;

public class Sastojak {
    private String naziv;
    private int cena;

    public Sastojak(int cena, String naziv) {
        this.cena = cena;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void stampaj() {
        System.out.print("(" + naziv + ", " + cena + ".din)");
    }
}
