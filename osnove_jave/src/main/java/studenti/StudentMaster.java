package studenti;

public class StudentMaster extends Student {

    public StudentMaster() {
    }

    public StudentMaster(String punoIme, String index, int godina) {
        super(punoIme, index, godina);
    }

    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean naBudzetu() {
        return this.godina < 2;
    }
}
