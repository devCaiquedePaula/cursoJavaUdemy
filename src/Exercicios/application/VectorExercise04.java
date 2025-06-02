package Exercicios.application;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class VectorExercise04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números serão digitados? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextInt();
        }
        System.out.println("Números pares:");
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.println(vect[i]);
                countEven++;
            }
        }
        System.out.printf("Quantidade de números pares: %d\n", countEven);
        sc.close();
    }
}
