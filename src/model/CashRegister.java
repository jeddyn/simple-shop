package model;
import java.util.List;
public class CashRegister {

private String number;
    private String receipt;
   List<Product> listofCodes;

    public CashRegister(String number, String receipt, List<Product> listofCodes) {
        this.number = number;
        this.receipt = receipt;
        this.listofCodes = listofCodes;
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

    public List<Product> getListofCodes() {
        return listofCodes;
    }

    public void setListofCodes(List<Product> listofCodes) {
        this.listofCodes = listofCodes;
    }

    @Override
    public String toString() {
        return "Kasa{" +
                "numer='" + number + '\'' +
                ", paragon='" + receipt + '\'' +
                ", listaKodowKreskowych=" + listofCodes +
                '}';
    }
}
