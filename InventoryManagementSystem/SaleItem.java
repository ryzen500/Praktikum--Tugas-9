// SaleItem.java
public class SaleItem {
    private Product product;
    private int quantity;

    // Konstruktor
    public SaleItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Menghitung total harga item penjualan
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    // Getter untuk product
    public Product getProduct() {
        return product;
    }

    // Getter untuk quantity
    public int getQuantity() {
        return quantity;
    }
}
