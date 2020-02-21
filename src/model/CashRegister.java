package model;
import java.util.List;
public class CashRegister {

private String numer;
    private String paragon;
   List<Product>listaKodowKreskowych ;

    public CashRegister(String numer, String paragon, List<Product> listaKodowKreskowych) {
        this.numer = numer;
        this.paragon = paragon;
        this.listaKodowKreskowych = listaKodowKreskowych;
    }

    public CashRegister() {
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

    public List<Product> getListaKodowKreskowych() {
        return listaKodowKreskowych;
    }

    public void setListaKodowKreskowych(List<Product> listaKodowKreskowych) {
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
