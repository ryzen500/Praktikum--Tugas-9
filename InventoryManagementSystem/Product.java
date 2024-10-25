// Product.java
public class Product {
    private String productName;
    private double price;

    // Konstruktor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Getter untuk productName
    public String getProductName() {
        return productName;
    }

    // Getter untuk price
    public double getPrice() {
        return price;
    }
}
