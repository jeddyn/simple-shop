package model;
import java.util.List;
public class Kasa {

private String numer;
    private String paragon;
   List<Produkt>listaKodowKreskowych ;

    public Kasa(String numer, String paragon, List<Produkt> listaKodowKreskowych) {
        this.numer = numer;
        this.paragon = paragon;
        this.listaKodowKreskowych = listaKodowKreskowych;
    }

    public Kasa() {
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public String getParagon() {
        return paragon;
    }

    public void setParagon(String paragon) {
        this.paragon = paragon;
    }

    public List<Produkt> getListaKodowKreskowych() {
        return listaKodowKreskowych;
    }

    public void setListaKodowKreskowych(List<Produkt> listaKodowKreskowych) {
        this.listaKodowKreskowych = listaKodowKreskowych;
    }

    @Override
    public String toString() {
        return "Kasa{" +
                "numer='" + numer + '\'' +
                ", paragon='" + paragon + '\'' +
                ", listaKodowKreskowych=" + listaKodowKreskowych +
                '}';
    }
}
