package proizvodi;

import java.util.ArrayList;

public abstract class Proizvod {
    protected ArrayList<Sastojak> sastojci = new ArrayList<>();

    public void dodajSastojak(Sastojak s) {
        this.sastojci.add(s);
    }

    public int cenaSastojaka() {
        int suma = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            suma += this.sastojci.get(i).getCena();
        }
        return suma;
    }

    public abstract int ukupnaCena();

    public abstract void stampaj();
}

//1. Zadatak
//
//Caribic želi da napravi program koji omogućava da se kreira proizvod sa proizvoljnim
//brojem dodataka.
//
//Npr: Ice point vanila sa dodacima: plazma, čokolada
//Npr: Pica sa dodacima: kačkavalj, masline, kečap, majonez
//
//Kreirati klasu Dodatak ili Sastojak (kako hoćete) koja ima:
//        • naziv dodatka
//• cenu dodatka
//• konstruktore, gettere i settere koji su vam potrebni
//• metodu stampaj koja štampa u formatu:
//        (dodatak) (cena)
//
//Kreirati apstraktnu klasu Proizvod koja ima:
//        • niz dodataka
//• metodu ubaciDodatak koja dodaje dodatak u niz
//• metodu koja vraća cenu svih dodataka koje ima proizvod
//• apstraktnu metodu ukupnu racunaj cenu
//• apstraktnu metodu stampaj
//
//Kreirati klasu IcePoint koja nasleđuje klasu Proizvod i koja ima:
//        • tip sladoleda (vanila, čokolada)
//• atribut koji kaže da li je mali ice point ili veliki (promenljiva tipa boolean)
//• override-uje metodu koja ukupnu cenu računa:
//        ○ ako je mali ice point na cenu svih dodataka doda 100
//        ○ ako je veliki ice point cenu svih dodataka doda 130
//        • override-uje metodu stampaj da stampa sve podatke
//
//Kreirati klasu Pica koja nasleđuje klasu Proizvod i koja ima:
//        • cenu podloge
//• override-uje metodu koja ukupnu cenu računa tako što na cenu svih dodataka
//doda i cenu podloge
//• override-uje metodu stampaj da stampa sve podatke
//
//U glavnom programu kreirati niz proizvoda od 3 IcePointa i 2 Pice.
//Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati
//ukupnu cenu porudžbine.
