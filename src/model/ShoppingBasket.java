package model;

import java.util.List;

public class ShoppingBasket {

    List<Product> productlist;

    public ShoppingBasket( List<Product> productlist ) {
        this.productlist = productlist;
    }

    public ShoppingBasket() {
    }

    public List<Product> getListaProduktów() {
        return productlist;
    }

    @Override
    public String toString() {
        return "ShoppingBasket{" +
                "productlist=" + productlist +
                '}';
    }

    public void setListaProduktów(List<Product> producrlist ) {
        this.productlist = producrlist;


    }
}

