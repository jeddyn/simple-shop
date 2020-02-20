package model;

public class CreditCard {
//test
    private String kodCVV;
    private String creditCardNumber;
    private String dataOdKiedyWażna;

    public CreditCard(String kodCVV, String creditCardNumber, String dataOdKiedyWażna) {
        this.kodCVV = kodCVV;
        this.creditCardNumber = creditCardNumber;
        this.dataOdKiedyWażna = dataOdKiedyWażna;
    }
//test
    public CreditCard() {
    }

    public String getKodCVV() {
        return kodCVV;
    }

    public void setKodCVV(String kodCVV) {
        this.kodCVV = kodCVV;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getDataOdKiedyWażna() {
        return dataOdKiedyWażna;
    }

    public void setDataOdKiedyWażna(String dataOdKiedyWażna) {
        this.dataOdKiedyWażna = dataOdKiedyWażna;
    }

    @Override
    public String toString() {
        return "KartaPłatnicza{" +
                "kodCVV='" + kodCVV + '\'' +
                ", numerKarty='" + creditCardNumber + '\'' +
                ", dataOdKiedyWażna='" + dataOdKiedyWażna + '\'' +
                '}';
    }
}
