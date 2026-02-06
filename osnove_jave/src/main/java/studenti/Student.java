package studenti;

public abstract class Student {
    protected String punoIme;
    protected String index;
    protected int godina;

    public Student() {
    }

    public Student(String punoIme, String index, int godina) {
        this.punoIme = punoIme;
        this.index = index;
        this.godina = godina;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public abstract int cenaSkolarine();

    public abstract boolean naBudzetu();

    public void stampaj() {
        System.out.println("IME: " + this.punoIme);
        System.out.println("INDEX: " + this.index);
        System.out.println("GODINA: " + this.godina);

        System.out.print("Finansiranje: ");
        if (this.naBudzetu()) {
            System.out.println("na budzetu");
        } else {
            System.out.println("samofinansirajuci");
        }

        System.out.println("Cena " + this.cenaSkolarine());
    }

}


//1. Zadatak
//
//Kreirati apstraktnu klasu Student koja ima:
//        • ime i prezime studenta
//• broj indeksa
//• godinu studija
//• gettere, settere i konstruktore
//• apstraktnu metodu koja vraća cenu školarine
//• apstraktnu metodu koja vraća da li je student na budžetu ili ne
//• metodu koja štampa podatke u formatu:
//ime i prezime, broj indeksa, godina studija
//Finansiranje: budžet/samofinansirajući
//Cena školarine: cena
//
//Kreirati klasu StudentOsnovnih koja nasleđuje klasu Student i koja ima:
//        • koja za cenu školarine vraća 90000
//        • za metodu da li je na budžetu vraća true ako je student ispod 5 godine studija
//
//Kreirati klasu StudentMaster koja nasleđuje klasu Student i koja ima:
//        • koja za cenu školarine vraća 100000
//        • za metodu da li je na budžetu vraća true ako je student ispod 2 godine studija
//
//U glavnoj klasi kreirati studente i testirati funkcionalnosti