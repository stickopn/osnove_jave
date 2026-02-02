package p23_05_2022;

public class Korisnik {
    private String ime;
    private String prezime;
    private int godine;
    private String email;

    //    Sablon za geter. Geter sluzi da kada je promenljiva private mora da se
//    napise u geteru kako bi mogla da se uzme vrednost iz drugog fajla
//   public TipAtributa getNazivAtributa() {
//        return tihs.atribut;
//   }

    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public int getGodine() {
        return this.godine;
    }

    public String getEmail() {
        return this.email;
    }

//    Seter sluzi da se menja vrednost kod privatnog atributa

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    default
    public Korisnik(){

    }
//    nedifolni konstrruktor je onaj koji ima parametre
        public Korisnik(String ime, String prezime, int godine, String email){
            this.ime = ime;
            this.prezime = prezime;
            this.godine = godine;
            this.email = email;
    }

    public Korisnik(String ime) {
        this.ime = ime;
    }

    public void stampaj() {
        System.out.println("Reziser: " + this.ime);
        System.out.println("Starost: " + this.prezime);
    }
}
