package p30_05_2022;

import java.util.ArrayList;

public class FacebookPostReakcijeMain {
    static void main() {
        ArrayList<Integer> brojevi = new ArrayList<>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(10);
        brojevi.add(20);

        int n = 10;

        int brojac = 0;
        for (int i = 0; i < brojevi.size(); i++) {
            if (brojevi.get(i) == n) {
                brojac++;
            }
        }
        System.out.println(brojac);


        FacebookPost post = new FacebookPost("Milan Jovanovic", "Cao svima!");

        post.reaguj(new Reakcija("srce", "Milan Markovic"));
        post.reaguj(new Reakcija("srce", "Darko Markovic"));
        post.reaguj(new Reakcija("like", "Stefan Markovic"));

        post.stampaj();
    }
}
