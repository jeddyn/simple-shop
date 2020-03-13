package model;

public class Product {

    private String name;
    private String description;
    private double price;
    private Boolean isWeight;
    private String productCode;

    public Product( String name, String description, double price, Boolean isWeight, String productCode) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isWeight = isWeight;
        this.productCode = productCode;

    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice( double price ) {
        this.price = price;
    }

    public Boolean getIsWeight() {
        return isWeight;
    }

    public void setIsWeight( Boolean isWeight ) {
        this.isWeight = isWeight;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode( String productCode ) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isWeight=" + isWeight +
                ", productCode='" + productCode + '\'' +
                '}';
    }
}
