// Order.java
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> orderItems;

    // Konstruktor
    public Order() {
        orderItems = new ArrayList<>();
    }

    // Menambahkan item pesanan ke dalam daftar
    public void addOrderItem(OrderItem item) {
        orderItems.add(item);
    }

    // Menghitung total seluruh pesanan
    public double calculateTotal() {
        double total = 0.0;
        for (OrderItem item : orderItems) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
