package model;

public class CreditCard {

    private String codeCvv;
    private String cardnumber;
    private String sinceitisvalid;

    public CreditCard(String codeCvv, String cardnumber, String sinceitisvalid) {
        this.codeCvv = codeCvv;
        this.cardnumber = cardnumber;
        this.sinceitisvalid = sinceitisvalid;
    }

    public CreditCard() {
    }

    public String getKodCVV() {
        return codeCvv;
    }

    public void setKodCVV(String kodCVV) {
        this.codeCvv = kodCVV;
    }

    public String getNumerKarty() {
        return cardnumber;
    }

    public void setNumerKarty(String numerKarty) {
        this.cardnumber = numerKarty;
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
                "codeCvv='" + codeCvv + '\'' +
                ", cardnumber='" + cardnumber + '\'' +
                ", sinceitisvalid='" + sinceitisvalid + '\'' +
                '}';
    }
}

