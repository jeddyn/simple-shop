package model;

public class Cashier {
    private String number;
    private String name;
    private String surname;
    private String position;

    public Cashier( String number, String name, String surname, String position ) {
        this.number= number;
        this.name= name;
        this.surname = surname;
        this.position = position;
    }

    public Cashier() {
    }

    public String getNumber() {
        return number ;
    }

    public void setNumber( String number ) {
        this.number = number;
    }

    public String getName() {
        return name ;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname( String surname ) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition( String position ) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
