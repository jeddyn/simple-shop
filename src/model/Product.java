package model;

public class Product {

    private String name;
    private String description;
    private double price;
    private Boolean ifWeight;
    private String BarCode;

    public Product(String name, String description, double price, Boolean ifWeight, String BarCode) {
        this.name =name;
        this.description =description;
        this.price =price;
        this.ifWeight =ifWeight;
        this.BarCode =BarCode;

    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getIfWeight() {
        return ifWeight;
    }

    public void setIfWeight(Boolean ifWeight) {
        this.ifWeight = ifWeight;
    }

    public String getBarCode() {
        return BarCode;
    }

    public void setBarCode(String barCode) {
        this.BarCode = barCode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", ifWeight=" + ifWeight +
                ", BarCode='" + BarCode + '\'' +
                '}';
    }
}
