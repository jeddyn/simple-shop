package model;

public class CreditCard {

    private String CVVCode; // 3 cyfry
    private String creditCardNumber; //19 cyfr
    private String date; // format 2000-03-12

    public CreditCard(String CVVCode, String creditCardNumber, String date) {
        this.CVVCode = CVVCode;
        this.creditCardNumber = creditCardNumber;
        this.date = date;
    }

    public CreditCard() {
    }

    public String getCVVCode() {
        return CVVCode;
    }

    public void setCVVCode(String CVVCode) {
        this.CVVCode = CVVCode;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber( String creditCardNumber ) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate( String date ) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "CCVCode='" + CVVCode + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
