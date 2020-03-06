package model;

public class Client {

private String  kartaPlatnicza;
    private String shoopingBasket;
    private double cash;
//test
    public Client(String kartaPlatnicza, String koszyk, double gotowka) {
        this.kartaPlatnicza = kartaPlatnicza;
        shoopingBasket = koszyk;
        this.cash = gotowka;
    }

    public Client() {
    }

    public String getKartaPlatnicza() {
        return kartaPlatnicza;
    }

    public void setKartaPlatnicza(String kartaPlatnicza) {
        this.kartaPlatnicza = kartaPlatnicza;
    }

    public String getShoopingBasket() {
        return shoopingBasket;
    }

    public void setShoopingBasket( String shoopingBasket ) {
        this.shoopingBasket = shoopingBasket;
    }

    public double getCash() {
        return cash;
    }

    public void setCash( double cash ) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Client{" +
                "kartaPlatnicza='" + kartaPlatnicza + '\'' +
                ", shoopingBasket='" + shoopingBasket + '\'' +
                ", cash=" + cash +
                '}';
    }
}
