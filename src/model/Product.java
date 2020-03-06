package model;

public class Product {

    private String name;
    private String description;
    private double price;
    private Boolean doYouNeedToWeighIt;
    private String barcode;

    public Product(String name, String description, double price, Boolean doYouNeedToWeighIt, String barcode) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.doYouNeedToWeighIt = doYouNeedToWeighIt;
        this.barcode = barcode;

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

    public Boolean getDoYouNeedToWeighIt() {
        return doYouNeedToWeighIt;
    }

    public void setDoYouNeedToWeighIt(Boolean doYouNeedToWeighIt) {
        this.doYouNeedToWeighIt = doYouNeedToWeighIt;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", doYouNeedToWeighIt=" + doYouNeedToWeighIt +
                ", barcode='" + barcode + '\'' +
                '}';
    }
}
