package model;

public class Product {

    private String Name;
    private String description;
    private double price;
    private Boolean doyouhavetoweigh;
    private String Barcode;

    public Product(String Name, String description, double price, Boolean doyouhavetoweigh, String Barcode) {
        this.Name = Name;
        this.description = description;
        this.price = price;
        this.doyouhavetoweigh = doyouhavetoweigh;
        this.Barcode = Barcode;

    }

    public Product() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getOpis() {
        return description;
    }

    public void setOpis(String description) {
        this.description = description;
    }

    public double getCena() {
        return price;
    }

    public void setCena(double price) {
        this.price = price;
    }

    public Boolean getDoyouhavetoweigh() {
        return doyouhavetoweigh;
    }

    public void setDoyouhavetoweigh(Boolean doyouhavetoweigh) {
        this.doyouhavetoweigh = doyouhavetoweigh;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        this.Barcode = barcode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", doyouhavetoweigh=" + doyouhavetoweigh +
                ", Barcode='" + Barcode + '\'' +
                '}';
    }
}

