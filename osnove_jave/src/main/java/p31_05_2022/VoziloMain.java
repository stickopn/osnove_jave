package p31_05_2022;

public class VoziloMain {
    static void main() {
        Vozilo v = new Vozilo();
        Kamion k = new Kamion();
        k.setRegistracija("329320932");
        k.setBrojVrata(2);
        k.setBrzina(100);
        k.setKubikaza(1000);
        k.setMarka("BMW");
        k.setNosivost(1000);
        k.setMaxBrzina(120);
        k.dodajGas(); // 110
        k.dodajGas(); // 120
        k.dodajGas(); // 130 -> 120
        k.stampaj();

        Auto a = new Auto();
        a.setBrojVrata(5);
        a.setRegistracija("9320923");
        a.setBrzina(100);
        a.setMarka("Ford");
        a.setBrojSedista(5);
        a.setMaxBrzina(150);
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();
        a.stampaj();



    }


    
}
