package model;

public class Client {

private String creditCard;
    private String  basket;
    private double cash;
//test
    public Client(String creditCard, String koszyk, double cash) {
        this.creditCard = creditCard;
        basket = koszyk;
        this.cash = cash;
    }

    public Client() {
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getKoszyk() {
        return basket;
    }

    public void setKoszyk(String koszyk) {
        basket = koszyk;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Client{" +
                "creditCard='" + creditCard + '\'' +
                ", basket='" + basket + '\'' +
                ", cash=" + cash +
                '}';
    }
}
