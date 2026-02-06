package studenti;

public class StudentMain {
    static void main() {
        StudentOsnovnih so = new StudentOsnovnih("Slobodan Kostic",  "12937", 1);
        StudentMaster sm = new StudentMaster("Tamara Kostic", "11657", 3);

        so.stampaj();
        sm.stampaj();
    }

}
