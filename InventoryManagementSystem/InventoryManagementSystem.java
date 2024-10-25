// InventoryManagementSystem.java
public class InventoryManagementSystem {
    public static void main(String[] args) {
        // Membuat produk
        Product laptop = new Product("Laptop", 750.00);
        Product smartphone = new Product("Smartphone", 500.00);

        // Membuat item penjualan
        SaleItem saleItem1 = new SaleItem(laptop, 2);
        SaleItem saleItem2 = new SaleItem(smartphone, 3);

        // Membuat transaksi
        Transaction transaction = new Transaction();
        transaction.addSaleItem(saleItem1);
        transaction.addSaleItem(saleItem2);

        // Menghitung dan menampilkan total pendapatan
        System.out.println("Total Pendapatan: " + transaction.calculateTotalRevenue());
    }
}
