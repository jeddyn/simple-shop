package model;

public class CreditCard {

    private String CVVcode;
    private String CardNumber;
    private String ExpDate;

    public CreditCard(String CVVcode, String CardNumber, String dataOdKExpDateiedyWażna) {
        this.CVVcode = CVVcode;
        this.CardNumber = CardNumber;
        this.ExpDate = ExpDate;
    }

    public CreditCard() {
    }

    public String getCVVcode() {
        return CVVcode;
    }

    public void setCVVcode(String CVVcode) {
        this.CVVcode = CVVcode;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.CardNumber = cardNumber;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String expDate) {
        this.ExpDate = expDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "CVVcode='" + CVVcode + '\'' +
                ", CardNumber='" + CardNumber + '\'' +
                ", ExpDate='" + ExpDate + '\'' +
                '}';
    }
}

