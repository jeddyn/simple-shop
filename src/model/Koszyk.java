package model;

import java.util.List;

public class Koszyk {
List<Produkt> listaProduktów;

    public Koszyk(List<Produkt> listaProduktów) {
        this.listaProduktów = listaProduktów;
    }

    public Koszyk() {
    }

    public List<Produkt> getListaProduktów() {
        return listaProduktów;
    }

    public void setListaProduktów(List<Produkt> listaProduktów) {
        this.listaProduktów = listaProduktów;
    }

    @Override
    public String toString() {
        return "Koszyk{" +
                ", listaProduktów=" + listaProduktów + '}';
    }
}

