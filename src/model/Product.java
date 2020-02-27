package model;

public class Product {

    private String  nazwa;
    private String  opis;
    private String  cena;
    private Boolean  czyTrzebaWazyc;
    private String  kodKreskowy;

    public Product( String nazwa, String opis, String cena, Boolean czyTrzebaWazyc, String kodKreskowy) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.cena = cena;
        this.czyTrzebaWazyc = czyTrzebaWazyc;
        this.kodKreskowy = kodKreskowy;

    }

    public Product() {
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public Boolean getCzyTrzebaWazyc() {
        return czyTrzebaWazyc;
    }

    public void setCzyTrzebaWazyc(Boolean czyTrzebaWazyc) {
        this.czyTrzebaWazyc = czyTrzebaWazyc;
    }

    public String getKodKreskowy() {
        return kodKreskowy;
    }

    public void setKodKreskowy(String kodKreskowy) {
        this.kodKreskowy = kodKreskowy;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                ", cena='" + cena + '\'' +
                ", czyTrzebaWazyc=" + czyTrzebaWazyc +
                ", kodKreskowy='" + kodKreskowy + '\'' +
                '}';
    }
}
