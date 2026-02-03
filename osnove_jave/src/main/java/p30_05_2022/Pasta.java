package p30_05_2022;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci = new ArrayList<>();

    public Pasta() {
    }

    public void dodajSastojak(Sastojak s) {
        this.sastojci.add(s);
    }

    public  void obrisiSastojak(String naziv) {
        for (int i = 0; i < sastojci.size(); i++) {
            if (this.sastojci.get(i).getNaziv().equals(naziv)) {
                this.sastojci.remove(i);
                i--;
//                this.sastojci.clear(); ili ovo umesto i--;
            }
        }
    }

    public double racunajCenu() {
        double suma = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            suma = suma + sastojci.get(i).getCena();
        }
        return suma;
    }

    public void stampaj() {
        for (int i = 0; i < sastojci.size(); i++) {
            this.sastojci.get(i).stampa();
        }
        System.out.println("Cena paste: " + this.racunajCenu());
    }
}
