package model;

public class Client {

private String card;
    private String basket;
    private double cash;
//test
    public Client(String card, String basket, double cash) {
        this.card = card;
        this.basket = basket;
        this.cash = cash;
    }

    public Client() {
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getBasket() {
        return basket;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "kartaPlatnicza='" + card + '\'' +
                ", Koszyk='" + basket + '\'' +
                ", gotowka=" + cash +
                '}';
    }
}
