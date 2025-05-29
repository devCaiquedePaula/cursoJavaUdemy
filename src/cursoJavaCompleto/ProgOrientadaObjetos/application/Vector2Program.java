package cursoJavaCompleto.ProgOrientadaObjetos.application;

import cursoJavaCompleto.ProgOrientadaObjetos.entities.Product;
import cursoJavaCompleto.ProgOrientadaObjetos.entities.VectorProducts;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um numero inteiro N e os dados (nome e preço) de N produtos.
//Armazenar esses N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
public class Vector2Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos serão digitados? ");
        int n = sc.nextInt();
        VectorProducts [] vect = new VectorProducts[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // Consume the newline character
            System.out.printf("Produto %d:\n", i + 1);
            String name = sc.nextLine();
            System.out.print("Preço: ");
            double price = sc.nextDouble();
            vect[i] = new VectorProducts(name, price);
        }
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("PREÇO MÉDIO: %.2f\n", avg);
        sc.close();
    }
}
