package model;

import java.util.List;

public class Basket {
private double łącznaCena;
List<Product> listaProduktów;

    public Basket(double łącznaCena, List<Product> listaProduktów) {
        this.łącznaCena = łącznaCena;
        this.listaProduktów = listaProduktów;
    }

    public Basket() {
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
        return "Koszyk{" +
                "łącznaCena='" + łącznaCena + '\'' +
                ", listaProduktów=" + listaProduktów + '}';
    }
}

