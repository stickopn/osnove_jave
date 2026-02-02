package p23_05_2022;

public class Reziser {
    private String punoIme;
    private int starost;

    public Reziser() {}

    public Reziser(String punoIme, int starost) {
        this.punoIme = punoIme;
        this.starost = starost;
    }

    public String getPunoIme() {
        return  this.punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getStarost() {
        return this.starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void stampaj() {
        System.out.println("Reziser: " + this.punoIme);
        System.out.println("Starost: " + this.starost);
    }
}
