package p30_05_2022;

import java.util.ArrayList;

public class PastaMain {
    static void main() {
        Pasta pasta = new Pasta();

        pasta.dodajSastojak(new Sastojak("beli luk", 100));
        pasta.dodajSastojak(new Sastojak("piletina", 200));
        pasta.dodajSastojak(new Sastojak("slanina", 50));
        pasta.dodajSastojak(new Sastojak("slanina", 60));
        pasta.dodajSastojak(new Sastojak("pene", 0));
        pasta.obrisiSastojak("slanina");
        pasta.stampaj();
    }
}
