package cursoJavaCompleto.ProgOrientadaObjetos.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Name: " + name +
                ", Price: $" + String.format("%.2f", price) +
                ", Quantity in stock: " + quantity +
                ", Total value in stock: $" + String.format("%.2f", totalValueInStock());
    }
}
