package p31_05_2022;

import java.util.ArrayList;

public class VoziloMain {
    static void main() {
//        Vozilo v = new Vozilo(); - ne moze sada da se poziva, zato sto je postavljena na abstract u osnovnoj klasi
//        Ali moguce je kreirati promenljivu tipa vozilo, odnosno promenljivu koja ce da cuva referencu na neki objekat

//        Polimorfizam - mnogo + izvrsenje
//        Polimorfizan - mozemo da pravimo promenljivu sa leve strane koja je tipa OSNOVNA klasa,
//        dok sa desne strane pravimo objekat izvedene klase
        Vozilo a = new Auto("24423424", "BMW", 200 , 5 , 1000 , 300 );
        Vozilo k = new Kamion("24234","Audi",100,5,1200,280,200);


        ArrayList<Vozilo> vozila = new ArrayList<>();
        vozila.add(new Auto("24423424", "BMW", 200 , 5 , 1000 , 300 ));
        vozila.add(new Kamion("24234","Audi",100,5,1200,280,200));

        for (int i = 0; i < vozila.size(); i++) {
            vozila.get(i).stampaj();
        }
//        Promenljiva OSNOVNE klase moze da cuva bilo koji objekat izvedene klase, zato mozemo ovako da pisemo

//        Vozilo z = a;
//        z = k;
//        Takodje ako bismo krenuli da pisemo a.{neka metoda}, tu moze da se pozove samo funkcionalsnost iz osnovne klase, ne i iz izvedene
//        Sto znaci da mora sve kroz konstruktor da se kreira
//        System.out.println();

//        Kamion k = new Kamion();
//        k.setRegistracija("329320932");
//        k.setBrojVrata(2);
//        k.setBrzina(100);
//        k.setKubikaza(1000);
//        k.setMarka("BMW");
//        k.setNosivost(1000);
//        k.setMaxBrzina(120);
//        k.dodajGas(); // 110
//        k.dodajGas(); // 120
//        k.dodajGas(); // 130 -> 120
//        k.stampaj();

//        Auto a = new Auto();
//        a.setBrojVrata(5);
//        a.setRegistracija("9320923");
//        a.setBrzina(100);
//        a.setMarka("Ford");
//        a.setBrojSedista(5);
//        a.setMaxBrzina(150);
//        a.dodajGas();
//        a.dodajGas();
//        a.dodajGas();
//        a.stampaj();



    }


    
}
