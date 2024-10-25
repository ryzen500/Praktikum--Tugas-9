// OrderItem.java
public class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    // Konstruktor
    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    // Mengembalikan total harga berdasarkan jumlah item
    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }
}
