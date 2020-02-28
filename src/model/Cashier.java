package model;

public class Cashier {
    private String number;
    private String name;
    private String surname;
    private String possitions;

    public Cashier(String number, String name, String surname, String possitions) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.possitions = possitions;
    }

    public Cashier() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPossitions() {
        return possitions;
    }

    public void setPossitions(String possitions) {
        this.possitions = possitions;
    }

    @Override
    public String toString() {
        return "Kasjer{" +
                "numer='" + number + '\'' +
                ", imie='" + name + '\'' +
                ", nazwiso='" + surname + '\'' +
                ", stanowisko='" + possitions + '\'' +
                '}';
    }
}
