package osoba_student_profesor;

public class Profesor extends Osoba {
    private String predmet;
    private int plata;

    public Profesor(String punoIme, String jmbg, String predmet, int plata) {
        super(punoIme, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Predmet: " + this.predmet);
        System.out.println("Plata: " + this.plata);
    }

    public void povecajPlatu(int procenat) {
        this.plata = this.plata * (100 + procenat) / 100;
    }
}
