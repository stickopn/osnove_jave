package proizvodi;

import java.util.ArrayList;

public class ProizvodiMain {
    static void main() {
        ArrayList<Proizvod> proizvodi = new ArrayList<>();

        IcePoint iceVanilla = new IcePoint(true, "vanilla");
        IcePoint maxIceVanilla = new IcePoint(false, "vanilla");
        Pica pica = new Pica(100);

        iceVanilla.dodajSastojak(new Sastojak(50, "banana"));
        iceVanilla.dodajSastojak(new Sastojak(40, "cokoladne mrvce"));
        iceVanilla.dodajSastojak(new Sastojak(20, "preliv jagoda"));

        maxIceVanilla.dodajSastojak(new Sastojak(50, "banana"));
        maxIceVanilla.dodajSastojak(new Sastojak(40, "cokoladne mrvce"));
        maxIceVanilla.dodajSastojak(new Sastojak(30, "preliv vanila"));

        pica.dodajSastojak(new Sastojak(100, "pecenica"));
        pica.dodajSastojak(new Sastojak(200, "kajmak"));

//        iceVanilla.stampaj();
//        maxIceVanilla.stampaj();
//        pica.stampaj();

        proizvodi.add(iceVanilla);
        proizvodi.add(maxIceVanilla);
        proizvodi.add(pica);

        for (int i = 0; i < proizvodi.size(); i++) {
            proizvodi.get(i).stampaj();
        }

        int cenaPorudzbine = 0;
        for (int i = 0; i < proizvodi.size(); i++) {
            cenaPorudzbine += proizvodi.get(i).ukupnaCena();
        }

        System.out.println("Cena porudzbine: " + cenaPorudzbine);
    }
}
