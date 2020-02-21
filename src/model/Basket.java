package model;

import java.util.List;

public class Basket {
private List<Product> listaProduktów;

    public Basket(List<Product> listaProduktów) {
        this.listaProduktów = listaProduktów;
    }


    public List<Product> getListaProduktów() {
        return listaProduktów;
    }

    public void setListaProduktów(List<Product> listaProduktów) {
        this.listaProduktów = listaProduktów;
    }

    @Override
    public String toString() {
        return "Koszyk{" +
                ", listaProduktów=" + listaProduktów + '}';
    }
}

