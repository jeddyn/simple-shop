package model;

public class CredictCard {

    private String kodCVV;
    private String numerKarty;
    private String dataOdKiedyWażna;

    public CredictCard(String kodCVV, String numerKarty, String dataOdKiedyWażna) {
        this.kodCVV = kodCVV;
        this.numerKarty = numerKarty;
        this.dataOdKiedyWażna = dataOdKiedyWażna;
    }

    public CredictCard() {
    }

    public String getKodCVV() {
        return kodCVV;
    }

    public void setKodCVV(String kodCVV) {
        this.kodCVV = kodCVV;
    }

    public String getNumerKarty() {
        return numerKarty;
    }

    public void setNumerKarty(String numerKarty) {
        this.numerKarty = numerKarty;
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
                ", numerKarty='" + numerKarty + '\'' +
                ", dataOdKiedyWażna='" + dataOdKiedyWażna + '\'' +
                '}';
    }
}