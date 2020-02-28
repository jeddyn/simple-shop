package model;
import java.util.List;
public class CashRegister {

private String number;
    private String receipt;
   List<Product> listOfProducts;

    public CashRegister(String numer, String paragon, List<Product> listaKodowKreskowych) {
        this.number = numer;
        this.receipt = paragon;
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

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
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
                ", paragon='" + receipt + '\'' +
                ", listaKodowKreskowych=" + listOfProducts +
                '}';
    }
}
