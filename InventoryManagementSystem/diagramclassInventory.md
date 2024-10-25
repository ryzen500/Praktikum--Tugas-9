``` mermaid

classDiagram
 direction RL
    class Product {
        - String productName
        - double price
        + getProductName() String
        + getPrice() double
    }

    class SaleItem {
        - Product product
        - int quantity
        + getTotalPrice() double
        + getProduct() Product
        + getQuantity() int
    }

    class Transaction {
        - List~SaleItem~ saleItems
        + addSaleItem(SaleItem item)
        + calculateTotalRevenue() double
        + getSaleItems() List~SaleItem~
    }

    Product <-- SaleItem : contains
    SaleItem <-- Transaction : manages

    ```
