package p16_05_2022;

public class Zadatak4 {
    public static void main(String[] args) {
        String ime = "Slobodan";
        String prezime = "Kostic";
        int age = 36;
        printPerson(ime, prezime, age);
        printPerson("Tamara", "Kostic", 39);

        System.out.println("KRAJ");
    }

    static void printPerson(String fname, String lname, int age) {
        System.out.println(fname + " " + lname + ", age: " + age);
    }
}
