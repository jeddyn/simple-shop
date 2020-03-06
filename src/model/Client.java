package model;

public class Client {

private String CreditCard;
    private String Basket;
    private double Money;

    public Client(String creditCard, String basket, double money) {
        this.CreditCard = creditCard;
        Basket = basket;
        this.Money = money;
    }

    public Client() {
    }

    public String getCreditCard() {
        return CreditCard;
    }

    public void setCreditCard(String creditCard) {
        this.CreditCard = creditCard;
    }

    public String getBasket() {
        return Basket;
    }

    public void setBasket(String basket) {
        Basket = basket;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        this.Money = money;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Basket='" + Basket + '\'' +
                ", Basket='" + Basket + '\'' +
                ", Money=" + Money +
                '}';
    }
}
