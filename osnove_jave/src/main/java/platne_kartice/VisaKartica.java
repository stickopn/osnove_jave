package platne_kartice;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(double suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }

    private double racunajProviziju(double iznos) {
//        double provizija = iznos * 0.018;
//        if (provizija < 4) {
//            return 4;
//        }
//        return provizija;
        double provizija = iznos * 0.018;
        return provizija < 4 ? 4 : provizija;
    }

    @Override
    public void izvrsiTransakciju(double iznos) {
        this.suma = this.suma - iznos - racunajProviziju(iznos);
    }
    @Override
    public void stampaj() {
        System.out.println("Visa Card");
    }
}
