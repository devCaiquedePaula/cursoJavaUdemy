package cursoJavaCompleto.ProgOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia um numero inteiro N e a altura de N pessoas.
// Armazenar esses N valores em um vetor. Em seguida, mostrar a altura média dessas pessoas.
public class VectorProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        double[] alturas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += alturas[i];
        }
        double media = soma / n;
        System.out.printf("Altura média: %.2f%n", media);
        sc.close();
    }
}
