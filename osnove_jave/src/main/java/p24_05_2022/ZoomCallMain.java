package p24_05_2022;

public class ZoomCallMain {
    static void main() {
        Korisnik milan = new Korisnik("Slobodan Kostic");
//        Korisnik mladen = new Korisnik();
//        mladen.setPunoIme("Tamara Kostic");
        milan.pretplatiSe(100);
//        System.out.println(milan.maksimalnaDuzinaPoziva());
//        milan.ponistiPretplatu();
//        System.out.println(milan.maksimalnaDuzinaPoziva());
//        System.out.println();
        Korisnik nikola = new Korisnik("Nikola Nikolic");
        nikola.pretplatiSe(150);
        ZoomCall call = new ZoomCall("neki url", "1234234", nikola);
        call.setGuest(nikola);
        call.pokreniCall();
    }
}
