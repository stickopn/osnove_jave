package osoba_student_profesor;

public class OsobaMain {
    static void main() {
        Profesor p = new Profesor("Slobodan Kostic",
                "2323323332332",
                "QA",
                200000);
        p.stampaj();
        p.povecajPlatu(10);
        p.stampaj();

        Student s = new Student("Slobodan Kostic",
                "354645646456",
                "12937",
                160000);
        s.stampaj();
        s.uplatiSkolarinu(10000);
        s.stampaj();
    }
}
