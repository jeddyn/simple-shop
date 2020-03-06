package model;

public class CreditCard {

    private String CCVCode;
    private String creditCardnumber;
    private String sinceitisvalid;

    public CreditCard(String codeCvv, String cardnumber, String sinceitisvalid) {
        this.CCVCode = codeCvv;
        this.creditCardnumber = cardnumber;
        this.sinceitisvalid = sinceitisvalid;
    }

    public CreditCard() {
    }

    public String getKodCVV() {
        return CCVCode;
    }

    public void setKodCVV(String kodCVV) {
        this.CCVCode = kodCVV;
    }

    public String getNumerKarty() {
        return creditCardnumber;
    }

    public void setNumerKarty(String numerKarty) {
        this.creditCardnumber = numerKarty;
    }

    public String getSinceitisvalid() {
        return sinceitisvalid;
    }

    public void setSinceitisvalid(String sinceitisvalid) {
        this.sinceitisvalid = sinceitisvalid;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "codeCvv='" + CCVCode + '\'' +
                ", cardnumber='" + creditCardnumber + '\'' +
                ", sinceitisvalid='" + sinceitisvalid + '\'' +
                '}';
    }
}

