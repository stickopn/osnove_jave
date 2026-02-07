package objekti;

public class Kuca extends Objekat{

    private int brojClanova;

    public Kuca() {
        super();
    }

    public Kuca(String adresa, double povrsina, int zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double racunajPorez() {
        return this.povrsina * koeficijent();
    }

    @Override
    public void stampaj() {
        System.out.print(this.adresa + ", ");
        System.out.print(this.povrsina + ", ");
        System.out.print(this.zona + ", ");
        System.out.print(this.brojClanova);
    }

}
