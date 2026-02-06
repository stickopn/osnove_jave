package p31_05_2022;
//IZVEDENA KLASA
public class Auto extends Vozilo {
    private int brojSedista;

    public Auto(String number, String bmw, int i, int i1, int i2, int i3) {
    }

    public int getBrojSedista() {
        return brojSedista;
    }

    public void setBrojSedista(int brojSedista) {
        this.brojSedista = brojSedista;
    }

    @Override
    public void stampaj() {
        System.out.println("Auto");
        System.out.println(this.brojVrata);
        System.out.println(this.registracija);
        System.out.println(this.brzina);
        System.out.println(this.marka);
        System.out.println(this.kubikaza);
        System.out.println(this.maxBrzina);
    }
}
