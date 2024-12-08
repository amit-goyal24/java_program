import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addStock(int quantity) {
        this.quantity += quantity;
    }

    public void reduceStock(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Insufficient stock for product: " + productName);
        }
    }

    public double getValue() {
        return price * quantity;
    }
}

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        // Add 5 products to the list
        products.add(new Product(101, "Laptop", 45000, 10));
        products.add(new Product(102, "Smartphone", 25000, 20));
        products.add(new Product(103, "Tablet", 15000, 15));
        products.add(new Product(104, "Headphones", 5000, 30));
        products.add(new Product(105, "Smartwatch", 10000, 25));

        // Calculate and print the total value of the inventory
        double totalValue = calculateTotalValue(products);
        System.out.println("Total Value of Inventory: " + totalValue);

        // Example of adding and reducing stock
        products.get(0).addStock(5);
        products.get(1).reduceStock(15);

        // Recalculate and print the total value after modifications
        totalValue = calculateTotalValue(products);
        System.out.println("Total Value of Inventory after modifications: " + totalValue);
    }

    public static double calculateTotalValue(ArrayList<Product> products) {
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getValue();
        }
        return totalValue;
    }
}