package proizvodi;

public class Pica extends Proizvod{
    private int cenaPodloge;

    public Pica(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    public int getCenaPodloge() {
        return cenaPodloge;
    }

    public void setCenaPodloge(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public int ukupnaCena() {
        return this.cenaSastojaka() + cenaPodloge;
    }

    @Override
    public void stampaj() {
        System.out.println("Pica");

        for (int i = 0; i < this.sastojci.size(); i++) {
            this.sastojci.get(i).stampaj();
        }

        System.out.println();
    }
}
