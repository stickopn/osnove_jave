package p24_05_2022;

public class UgovorMain {
    static void main() {
        FizickoLice milan = new FizickoLice("Slobodan Kostic",
                "00342424", "2609989788779", false);
//        milan.stampaj();
        FizickoLice dragan = new FizickoLice("Dragan Kostic",
                "003424dgdg24", "2609959788779", true);

        Ugovor ugovor = new Ugovor(
                "24.05.2022.",
                milan,
                dragan,
                50000,
                "Nikole Pasica"
        );

        ugovor.stampajUgovor();
    }
}
