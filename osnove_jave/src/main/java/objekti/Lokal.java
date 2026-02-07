package objekti;

public class Lokal extends Objekat {
    public Lokal () {
        super();
    }

    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double racunajPorez() {
        return this.povrsina * koeficijent() * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.print(this.adresa + ", ");
        System.out.print(this.povrsina + ", ");
        System.out.print(this.zona + ", ");
    }
}
