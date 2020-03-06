package model;

import java.util.List;

public class ShoppingBasket {

   private List<Product> listOfproducts;

    public ShoppingBasket( List<Product> productlist ) {
        this.listOfproducts = productlist;
    }

    public ShoppingBasket() {
    }

    public List<Product> getListaProduktów() {
        return listOfproducts;
    }

    @Override
    public String toString() {
        return "ShoppingBasket{" +
                "productlist=" + listOfproducts +
                '}';
    }

    public void setListaProduktów(List<Product> producrlist ) {
        this.listOfproducts = producrlist;


    }
}

