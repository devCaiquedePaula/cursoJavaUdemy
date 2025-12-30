package módulo_04.exercícios_de_fixação.problema_exemplo_produto_estoque;

import java.util.Locale;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter product name:");
        String name = input.nextLine();
        System.out.println("Enter product price:");
        double price = input.nextDouble();
        System.out.println("Enter product quantity in stock:");
        int quantity = input.nextInt();
        
        Product product = new Product();
        product.name = name;
        product.price = price;
        product.quantity = quantity;
        
        System.out.println("Product data: " + product);

        System.out.println("--------------------------------");

        System.out.println("O que deseja fazer ao estoque do produto?");
        System.out.println("1 - Adicionar produtos");
        System.out.println("2 - Remover produtos");

        System.out.println("--------------------------------");
        
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Enter the number of products to be added in stock:");
            int addQuantity = input.nextInt();
            product.AddProducts(addQuantity);
            System.out.println("Updated data: " + product);
        } else if (choice == 2) {
            System.out.println("Enter the number of products to be removed from stock:");
            int removeQuantity = input.nextInt();
            product.RemoveProducts(removeQuantity);
            System.out.println("Updated data: " + product);
        } else {
            System.out.println("Invalid choice.");
        }
        
        input.close();
    }
}
