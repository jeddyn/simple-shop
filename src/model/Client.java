package model;

public class Client {

    private CreditCard creditCard;
    private ShoppingBasket shoppingBasket;
    private double cash;

    //test
    public Client( CreditCard creditCard, ShoppingBasket shoppingBasket, double cash ) {
        this.creditCard = creditCard;
        this.shoppingBasket = shoppingBasket;
        this.cash = cash;
    }

    public Client() {
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard( CreditCard creditCard ) {
        this.creditCard = creditCard;
    }

    public ShoppingBasket getShoppingBasket() {
        return shoppingBasket;
    }

    public void setShoppingBasket( ShoppingBasket shoppingBasket ) {
        this.shoppingBasket = shoppingBasket;
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
                "kartaPlatnicza='" + creditCard + '\'' +
                ", shoopingBasket='" + shoppingBasket + '\'' +
                ", cash=" + cash +
                '}';
    }
}
