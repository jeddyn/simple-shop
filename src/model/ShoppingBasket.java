package model;

import java.util.List;

public class ShoppingBasket {
private double łącznaCena;
List<Product> listaProduktów;

    public ShoppingBasket( double łącznaCena, List<Product> listaProduktów) {
        this.łącznaCena = łącznaCena;
        this.listaProduktów = listaProduktów;
    }

    public ShoppingBasket() {
    }

    public double getŁącznaCena() {
        return łącznaCena;
    }

    public void setŁącznaCena(double łącznaCena) {
        this.łącznaCena = łącznaCena;
    }

    public List<Product> getListaProduktów() {
        return listaProduktów;
    }

    public void setListaProduktów(List<Product> listaProduktów) {
        this.listaProduktów = listaProduktów;
    }

    @Override
    public String toString() {
        return "ShoppingBasket{" +
                "łącznaCena='" + łącznaCena + '\'' +
                ", listaProduktów=" + listaProduktów + '}';
    }
}

