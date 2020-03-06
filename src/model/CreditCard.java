package model;

public class CreditCard {

    private String cardCode;
    private String cardNumber;
    private String expirationDate;

    public CreditCard(String cardCode, String cardNumber, String dataOdKiedyWażna) {
        this.cardCode = cardCode;
        this.cardNumber = cardNumber;
        this.expirationDate = dataOdKiedyWażna;
    }

    public CreditCard() {
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDataOdKiedyWażna() {
        return expirationDate;
    }

    public void setDataOdKiedyWażna(String dataOdKiedyWażna) {
        this.expirationDate = dataOdKiedyWażna;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardCode='" + cardCode + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
