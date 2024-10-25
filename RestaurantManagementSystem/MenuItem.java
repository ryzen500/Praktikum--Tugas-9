// MenuItem.java
public class MenuItem {
    private String name;
    private double price;

    // Konstruktor
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter untuk name
    public String getName() {
        return name;
    }

    // Getter untuk price
    public double getPrice() {
        return price;
    }
}
