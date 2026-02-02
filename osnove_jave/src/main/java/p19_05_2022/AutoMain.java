package p19_05_2022;

public class AutoMain {
    static void main() {
        Auto fica = new Auto();
        fica.vozac = "Slobodan Kostic";
        fica.brojVrata = 5;
        fica.marka = "Fica";
        fica.potrosnjaNa100km = 2.3;
        fica.trenutnaBrzina = 50;
        fica.registracija = "PN-009";
        fica.kubikaza = 1500;
        fica.registrovanDo = 10;
        fica.godinaProizvodnje = 1970;
        fica.kapacitetRezervoara = 50;
        fica.trenutnoURezervoaru = 20;
        fica.stampaj();
        if (fica.prekoracenje(90)) {
            System.out.println("Kazna za prekoracenje je: " + fica.kazna(90));
        }

        if (fica.jeOldTimer()) {
            System.out.println("Aut oje oldtimer.");
        }

        if (fica.isteklaRegistracija(7)) {
            System.out.println("Registracija je istekla.");
        }

        System.out.println("Cena registracije je: " + fica.cenaRegistracije());

        System.out.println("Cena goriva nakon dolivanja 5l je: " + fica.natociGorivo(5));

        System.out.println();

        fica.dodajGas();
        fica.dodajGas();
        fica.dodajGas();

        System.out.println("Stampa nakon 3 puta dodaj gas");
        fica.stampaj();

        fica.koci();

        System.out.println("Stampa nakon kocenja");
        fica.stampaj();
        System.out.println("Trenutna potrosnja je: " + fica.trenutnaPotrosnja());

        System.out.println();
        Auto bmw = new Auto();
        bmw.vozac = "Dragan Jovanovic";
        bmw.brojVrata = 5;
        bmw.marka = "BMW";
        bmw.potrosnjaNa100km = 2.3;
        bmw.trenutnaBrzina = 100;
        bmw.stampaj();
        if (bmw.prekoracenje(90)) {
            System.out.println("Kazna za prekoracenje je: " + bmw.kazna(90));
        }
    }
}
