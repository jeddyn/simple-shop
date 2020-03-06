package model;

import java.util.List;

public class ShoppingBasket {

List<Product> listOffProducts;

    public ShoppingBasket(List<Product> listOffProducts) {
        this.listOffProducts = listOffProducts;
    }

    public ShoppingBasket() {
    }

    public List<Product> getListOffProducts() {
        return listOffProducts;
    }

    public void setListOffProducts(List<Product> listOffProducts) {
        this.listOffProducts = listOffProducts;
    }

    @Override
    public String toString() {
        return "ShoppingBasket{" +
                "listOffProducts=" + listOffProducts +
                '}';
    }
}

