package p19_05_2022;

public class User {
    public String fullName;
    public String email;
    public int year;
    public String password;

    //    Static znaci da je ta metoda deo ove klase a ne deo objekta gde se poziva ta klasa, tako da se one izbegavaju
//    i necemo stavljati static
//    public static void staticStampa() {
//
//    }

//    public void stampa(User this) - umesto da se pisu parametri, ovde stoji nevidljivo this
    public void stampa() {
      System.out.println("Ime i prezime: " + this.fullName);
      System.out.println("Email: " + this.email);
      System.out.println("Godina: " + this.year);
      System.out.println("Password: " + this.password);
    }

//    moze da radi i bez this ali preporuka je da se uvek pise
    public int age(int currentYear) {
        return currentYear - this.year;
    }

    public boolean punoletan(int currentYear) {
        int age = currentYear - this.year;
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean login (String emailSaLogina, String passwordSaLogina) {
        if (email.equals(emailSaLogina) && password.equals(passwordSaLogina)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean changePassword(String oldPassword, String newPassword, String confirmPassword) {
        if (this.password.equals(oldPassword) && newPassword.equals(confirmPassword)) {
            this.password = newPassword;
            return true;
        } else {
            return false;
        }
    }
}
