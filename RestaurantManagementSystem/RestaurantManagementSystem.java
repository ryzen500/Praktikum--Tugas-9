// RestaurantManagementSystem.java
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Membuat item menu
        MenuItem pizza = new MenuItem("Burger",50000);
        MenuItem burger = new MenuItem("Fries", 20000);

        // Membuat item pesanan
        OrderItem orderItem1 = new OrderItem(pizza, 2);
        OrderItem orderItem2 = new OrderItem(burger, 3);

        // Membuat pesanan
        Order order = new Order();
        order.addOrderItem(orderItem1);
        order.addOrderItem(orderItem2);

        // Menghitung dan menampilkan total pesanan
        System.out.println("Total pesanan: " + order.calculateTotal());
    }
}
