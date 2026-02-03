package p30_05_2022;

import java.util.ArrayList;

public class FacebookPost {
    private String autor;
    private String text;
    private ArrayList<Reakcija> reakcije = new ArrayList<>();

    public FacebookPost(String autor, String text) {
        this.autor = autor;
        this.text = text;
    }

    public void reaguj(Reakcija r) {
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getKorisnik().equals(r.getKorisnik())) {
                this.reakcije.remove(i);
                break;
            }
        }
        this.reakcije.add(r);
    }

    private int brojReakcija(String tipReakcije) {
        int brojac = 0;

        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTip().equals(tipReakcije)) {
                brojac++;
            }
        }
        return brojac;
    }

    public void stampaj() {
        System.out.println(this.autor);
        System.out.println(this.text);

        System.out.print("Smajli " + this.brojReakcija("smajli") + " | ");
        System.out.print("Like " + this.brojReakcija("lajk") + " | ");
        System.out.print("Srce " + this.brojReakcija("srce"));
    }
}
