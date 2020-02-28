package model;

import java.util.List;

public class ShoppingBasket {

    List<Product> listaProduktow;

    public ShoppingBasket( List<Product> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public ShoppingBasket() {
    }

    public List<Product> getListaProduktow() {
        return listaProduktow;
    }

    public void setListaProduktow(List<Product> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    @Override
    public String toString() {
        return "Koszyk{" +
                ", listaProduktów=" + listaProduktow + '}';
    }
}

