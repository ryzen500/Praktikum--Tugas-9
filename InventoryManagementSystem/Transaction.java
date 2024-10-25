// Transaction.java
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private List<SaleItem> saleItems;

    // Konstruktor
    public Transaction() {
        saleItems = new ArrayList<>();
    }

    // Menambahkan item penjualan ke dalam daftar
    public void addSaleItem(SaleItem item) {
        saleItems.add(item);
    }

    // Menghitung total pendapatan dari semua item yang terjual
    public double calculateTotalRevenue() {
        double totalRevenue = 0.0;
        for (SaleItem item : saleItems) {
            totalRevenue += item.getTotalPrice();
        }
        return totalRevenue;
    }

    // Getter untuk saleItems
    public List<SaleItem> getSaleItems() {
        return saleItems;
    }
}
