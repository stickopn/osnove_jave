package figure;

import java.util.ArrayList;

public class FiguraMain {
    static void main() {
        ArrayList<Figura> figure = new ArrayList<>();
        figure.add(new JednakostranicniTrougao(3));
        figure.add(new Pravougaonik(5, 6));
        figure.add(new JednakostranicniTrougao(4));
        figure.add(new Pravougaonik(2, 1));
        figure.add(new Pravougaonik(4, 6));

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
            System.out.println();
        }

        double povrsine = 0;
        for (int i = 0; i < figure.size(); i++) {
            povrsine += figure.get(i).povrsina();
        }
        System.out.println("Povrsine: " + povrsine);
        double obimi = 0;
        for (int i = 0; i < figure.size(); i++) {
            obimi += figure.get(i).obim();
        }
        System.out.println("Obimi: " + obimi);

    }
}
