package figure;

public class Pravougaonik extends  Figura {
    private double a;
    private double b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }

    @Override
    public double obim() {
        return 2 * a + b;
    }
}
