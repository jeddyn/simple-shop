package model;
import java.util.List;
public class CashRegister {

private String number;
    private String paragon;
   List<Product> listOfProducts;

    public CashRegister(String numer, String paragon, List<Product> listaKodowKreskowych) {
        this.number = numer;
        this.paragon = paragon;
        this.listOfProducts = listaKodowKreskowych;
    }

    public CashRegister() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getParagon() {
        return paragon;
    }

    public void setParagon(String paragon) {
        this.paragon = paragon;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    @Override
    public String toString() {
        return "Kasa{" +
                "numer='" + number + '\'' +
                ", paragon='" + paragon + '\'' +
                ", listaKodowKreskowych=" + listOfProducts +
                '}';
    }
}
