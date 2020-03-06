package model;

public class Client {

private CreditCard card;
    private ShoppingBasket basket;
    private double cash;
//test
    public Client(CreditCard card, ShoppingBasket basket, double cash) {
        this.card = card;
        this.basket = basket;
        this.cash = cash;
    }

    public Client() {
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public ShoppingBasket getBasket() {
        return basket;
    }

    public void setBasket(ShoppingBasket basket) {
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
        return "Client{" +
                "card='" + card + '\'' +
                ", basket='" + basket + '\'' +
                ", cash=" + cash +
                '}';
    }
}

