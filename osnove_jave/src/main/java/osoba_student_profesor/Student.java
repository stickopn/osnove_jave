package osoba_student_profesor;

public class Student extends Osoba {
    private String index;
    private int dug;

    public Student(String punoIme, String jmbg, String index, int dug) {
        super(punoIme, jmbg);
        this.index = index;
        this.dug = dug;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Index: " + this.index);
        System.out.println("Dug: " + this.dug);
    }

    public void uplatiSkolarinu(int iznos) {
        this.dug = this.dug - iznos;
        if (this.dug < 0) {
            this.dug = 0;
        }
    }
}
