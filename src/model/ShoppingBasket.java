package model;

import java.util.List;

public class ShoppingBasket {

    List<Product> listaProduktów;

    public ShoppingBasket( List<Product> listaProduktów ) {
        this.listaProduktów = listaProduktów;
    }

    public ShoppingBasket() {
    }

    public List<Product> getListaProduktów() {
        return listaProduktów;
    }

    public void setListaProduktów( List<Product> listaProduktów ) {
        this.listaProduktów = listaProduktów;
    }

    @Override
    public String toString() {
        return "Koszyk{" +
                ", listaProduktów=" + listaProduktów + '}';
    }
}

