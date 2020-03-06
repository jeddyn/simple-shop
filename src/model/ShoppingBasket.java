package model;

import java.util.List;

public class ShoppingBasket {

    List<Product> listOfProducts;

    public ShoppingBasket( List<Product> listOfProducts ) {
        this.listOfProducts = listOfProducts;
    }

    public ShoppingBasket() {
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts( List<Product> listOfProducts ) {
        this.listOfProducts = listOfProducts;
    }

    @Override
    public String toString() {
        return "ShoppingBasket{" +
                "listOfProducts=" + listOfProducts +
                '}';
    }
}

