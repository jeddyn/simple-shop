package model;

public class Client {

private String  kartaPlatnicza;
    private String  Koszyk;
    private double  gotowka;
//test
    public Client(String kartaPlatnicza, String koszyk, double gotowka) {
        this.kartaPlatnicza = kartaPlatnicza;
        Koszyk = koszyk;
        this.gotowka = gotowka;
    }

    public Client() {
    }

    public String getKartaPlatnicza() {
        return kartaPlatnicza;
    }

    public void setKartaPlatnicza(String kartaPlatnicza) {
        this.kartaPlatnicza = kartaPlatnicza;
    }

    public String getKoszyk() {
        return Koszyk;
    }

    public void setKoszyk(String koszyk) {
        Koszyk = koszyk;
    }

    public double getGotowka() {
        return gotowka;
    }

    public void setGotowka(double gotowka) {
        this.gotowka = gotowka;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "kartaPlatnicza='" + kartaPlatnicza + '\'' +
                ", Koszyk='" + Koszyk + '\'' +
                ", gotowka=" + gotowka +
                '}';
    }
}
