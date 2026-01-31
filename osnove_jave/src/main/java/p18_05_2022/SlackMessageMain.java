package p18_05_2022;

public class SlackMessageMain {
    public static void main(String[] args) {

        SlackMessage first = new SlackMessage();
        first.text = "Cao svima!";
        first.author = "Milan Jovanovic";
        first.date = "18.05.2022 18:55";

        SlackMessage second = new SlackMessage();
        second.text = "Srecno na testu!";
        second.author = "Milan Jovanovic";
        second.date = "18.05.2022 20:55";

        System.out.println(first.author + " - " + first.date);
        System.out.println(first.text);

        System.out.println();

        System.out.println(second.author + " - " + second.date);
        System.out.println(second.text);
    }
}
