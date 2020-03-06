package model;

public class CreditCard {

    private String CVVcode;
    private String creditCardNumber;
    private String ExpDate;

    public CreditCard(String CVVcode, String CardNumber, String dataOdKExpDateiedyWażna) {
        this.CVVcode = CVVcode;
        this.creditCardNumber = CardNumber;
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

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
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
                ", CardNumber='" + creditCardNumber + '\'' +
                ", ExpDate='" + ExpDate + '\'' +
                '}';
    }
}

