package cursoJavaCompleto.ProgOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
public class VectorExercise01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        while (n < 1 || n > 10) {
            System.out.print("Número inválido! Digite um número entre 1 e 10: ");
            n = sc.nextInt();
        }
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextInt();
        }
        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
