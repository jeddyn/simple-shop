package model;

public class CreditCard {

    private String CCVCode;
    private String creditCardNumber;
    private String date;

    public CreditCard( String CCVCode, String numerKarty, String dataOdKiedyWażna) {
        this.CCVCode = CCVCode;
        this.creditCardNumber = numerKarty;
        this.date = dataOdKiedyWażna;
    }

    public CreditCard() {
    }

    public String getCCVCode() {
        return CCVCode;
    }

    public void setCCVCode( String CCVCode ) {
        this.CCVCode = CCVCode;
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
                "CCVCode='" + CCVCode + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
