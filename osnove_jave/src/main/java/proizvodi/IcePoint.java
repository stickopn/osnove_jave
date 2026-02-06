package proizvodi;

public class IcePoint extends Proizvod {
    private boolean mail;
    private String tip;

    public IcePoint(boolean mail, String tip) {
        this.mail = mail;
        this.tip = tip;
    }

    public boolean isMail() {
        return mail;
    }

    public void setMail(boolean mail) {
        this.mail = mail;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public int ukupnaCena() {
        return isMail() ? this.cenaSastojaka() + 100 : this.cenaSastojaka() + 130;
    }

    @Override
    public void stampaj() {
        if (isMail()) {
            System.out.println("Mali ice point");
        } else {
            System.out.println("Veliki ice point");
        }

        for (int i = 0; i < this.sastojci.size(); i++) {
            this.sastojci.get(i).stampaj();
        }

        System.out.println();
    }
}
