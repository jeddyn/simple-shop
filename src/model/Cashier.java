package model;

public class Cashier {
    private String numer;
    private String imie;
    private String nazwisko;
    private String stanowisko;

    public Cashier( String numer, String imie, String nazwisko, String stanowisko) {
        this.numer = numer;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }

    public Cashier() {
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko( String nazwisko ) {
        this.nazwisko = nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString() {
        return "Kasjer{" +
                "numer='" + numer + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwiso='" + nazwisko + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}
