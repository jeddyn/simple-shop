package model;

import java.util.List;

public class CashRegister {

    private String number;
    private String receipt;
    private List<Product> listOfProducts;

    public CashRegister( String number, String receipt, List<Product> listOfProducts ) {
        this.number = number;
        this.receipt = receipt;
        this.listOfProducts = listOfProducts;
    }

    public CashRegister() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber( String number ) {
        this.number = number;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt( String receipt ) {
        this.receipt = receipt;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts( List<Product> listOfProducts ) {
        this.listOfProducts = listOfProducts;
    }

    @Override
    public String toString() {
        return "CashRegister{" +
                "number='" + number + '\'' +
                ", receipt='" + receipt + '\'' +
                ", listOfProducts=" + listOfProducts +
                '}';
    }
}
