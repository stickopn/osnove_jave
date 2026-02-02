package p19_05_2022;

public class UserMain {
    static void main(String[] args) {
        User u = new User();
        u.fullName = "Slobodan Kostic";
        u.email = "stickopn@gmail.com";
        u.year = 1989;
        u.password = "Sloba123";
        if (u.login("Zika", "Milan")) {
            System.out.println("Poklapaju se lozinka i pass!");
        } else {
            System.out.println("Ne poklapaju se lozinka i pass!");
        }

        u.stampa();
        int age = u.age(2026);
        System.out.println("Godine: " + age);

//        boolean punoletstvo = u.punoletan(2026);
//        System.out.println("Da li je punoletan: " + punoletstvo);

        if (u.punoletan(2026) == true) {
            System.out.println("Punoletan je!");
        } else {
            System.out.println("Maloletan je!");
        }

        u.changePassword("Sloba123", "PromenaPass", "PromenaPass");
        u.stampa();
    }
}
