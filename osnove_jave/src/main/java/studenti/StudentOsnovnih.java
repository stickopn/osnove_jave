package studenti;

public class StudentOsnovnih extends Student {
    public StudentOsnovnih() {
    }

    public StudentOsnovnih(String punoIme, String index, int godina) {
        super(punoIme, index, godina);
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean naBudzetu() {
        return this.godina < 5;
    }
}
