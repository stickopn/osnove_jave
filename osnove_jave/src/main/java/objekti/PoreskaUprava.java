package objekti;

import java.util.ArrayList;
import java.util.List;

public class PoreskaUprava {
    private String grad;

    private List<Objekat> objekti = new ArrayList<>();

    public PoreskaUprava() {
        super();
    }

    public PoreskaUprava(String grad) {
        this.grad = grad;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public void dodajObjekat(Objekat o) {
        this.objekti.add(o);
    }

    public double ukupanPorez() {
        double suma = 0;

        for (int i = 0; i < this.objekti.size(); i++) {
            suma += this.objekti.get(i).racunajPorez();
        }

        return suma;
    }

    public void stampajSve() {
        for (int i = 0; i < this.objekti.size(); i++) {
            this.objekti.get(i).stampaj();
        }
        System.out.println("Ukupan porez: " + this.ukupanPorez());
    }

//    Na povratnu vrednost Objekat vrati adresu do objekta koja ima najveci porez
    public Objekat najveciPorez() {
//        Prvo resenje
//        double maxPorez = this.objekti.get(0).racunajPorez();
//        int pozicija = 0;
//        for (int i = 0; i < this.objekti.size(); i++) {
//            if (this.objekti.get(i).racunajPorez() > maxPorez) {
//                maxPorez = this.objekti.get(i).racunajPorez();
//                pozicija = i;
//            }
//        }
//        System.out.println(pozicija);
//        System.out.println(maxPorez);
//
//        return objekti.get(pozicija);

//        Drugo resenje

        Objekat najveci = this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).racunajPorez() > najveci.racunajPorez()) {
                najveci = this.objekti.get(i);
            }
        }
        return najveci;
    }
}
