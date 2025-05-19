package cursoJavaCompleto.ProgOrientadaObjetos.application;

import cursoJavaCompleto.ProgOrientadaObjetos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println("------------------------------");
        System.out.println("Product data -> " + product);
        System.out.println("------------------------------");

        System.out.print("Enter the number of products to be added in stock: ");
        int quantityToAdd = sc.nextInt();
        product.addProducts(quantityToAdd);
        System.out.println("Updated data -> " + product);
        System.out.println("------------------------------");

        System.out.print("Enter the number of products to be removed from stock: ");
        int quantityToRemove = sc.nextInt();
        product.removeProducts(quantityToRemove);
        System.out.println("Updated data -> " + product);
        System.out.println("------------------------------");

        sc.close();
    }
}
