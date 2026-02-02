package p24_05_2022;

public class Ugovor {
    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresa;

    public Ugovor(String datum,
                  FizickoLice prodavac,
                  FizickoLice kupac,
                  int cena,
                  String adresa) {
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

//    public double procenatZarade() {
//        if (this.kupac.isVecKupovao()) {
//            return 0.02;
//        }
//        return 0.03;
//    }
//    Kraci nacin
//    OVO JE TERNARY OPERATOR
    public double procenatZarade() {
        return this.kupac.isVecKupovao() ? 0.02 : 0.03;
    }

    public double racunajZaradu() {
        return 1000 + this.cena * this.procenatZarade();
    }

    public void stampajUgovor() {
        String print = String.format(
                "Dana %s god sklopljen je ugovor" +
                        " izmedju %s i %s o kupovini nekretnine" +
                        " %s po ceni od %s pri cemu je kupac u " +
                        " obavezi da agenciji isplati novcanu vrednost u " +
                        " iznosu od %s",
                this.datum,
                this.prodavac.getPunoIme(),
                this.kupac.getPunoIme(),
                this.adresa,
                this.cena,
                this.racunajZaradu());
        System.out.println(print);
    }
}
