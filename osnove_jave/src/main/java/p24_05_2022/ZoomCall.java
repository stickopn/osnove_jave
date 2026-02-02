package p24_05_2022;

public class ZoomCall {
    private String url;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String url, String password, Korisnik host) {
        this.url = url;
        this.password = password;
        this.host = host;
    }

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public void pokreniCall() {
        System.out.println("Zoom Call: " + this.url);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getPunoIme());
        if (this.guest != null) {
            System.out.println("Guest: " + this.guest.getPunoIme());
        }
        System.out.print("Maksimalna duzina trajanja poziva je ");
        System.out.println(this.host.maksimalnaDuzinaPoziva());
    }
}
