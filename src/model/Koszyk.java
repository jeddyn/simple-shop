package model;

import java.util.List;

public class Koszyk {
private double łącznaCena;
List<Produkt> listaProduktów;

    public Koszyk(double łącznaCena, List<Produkt> listaProduktów) {
        this.łącznaCena = łącznaCena;
        this.listaProduktów = listaProduktów;
    }

    public Koszyk() {
    }

    public double getŁącznaCena() {
        return łącznaCena;
    }

    public void setŁącznaCena(double łącznaCena) {
        this.łącznaCena = łącznaCena;
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
                "łącznaCena='" + łącznaCena + '\'' +
                ", listaProduktów=" + listaProduktów + '}';
    }
}

