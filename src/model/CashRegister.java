package model;
import java.util.List;
public class CashRegister {

private String number;
    private String receipt;
   List<Product> listofcodes;

    public CashRegister(String number, String receipt, List<Product> listaKodowKreskowych) {
        this.number = number;
        this.receipt = receipt;
        this.listofcodes = listaKodowKreskowych;
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

    public List<Product> getListofcodes() {
        return listofcodes;
    }

    public void setListofcodes(List<Product> listofcodes) {
        this.listofcodes = listofcodes;
    }

    @Override
    public String toString() {
        return "Kasa{" +
                "numer='" + number + '\'' +
                ", paragon='" + receipt + '\'' +
                ", listaKodowKreskowych=" + listofcodes +
                '}';
    }
}
