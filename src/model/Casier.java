package model;

public class Casier {
    private String numer;
    private String imie;
    private String nazwisko;
    private String stanowisko;

    public Casier(String numer, String imie, String nazwiso, String stanowisko) {
        this.numer = numer;
        this.imie = imie;
        this.nazwisko = nazwiso;
        this.stanowisko = stanowisko;
    }

    public Casier() {
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

    public void setNazwisko(String nazwisko) {
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
