package Exercicios;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor
public class VectorExercise02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextDouble();
        }
        System.out.println("VALORES:");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.println();
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        double avg = sum / vect.length;
        System.out.printf("SOMA: %.2f\n", sum);
        System.out.printf("MÉDIA: %.2f\n", avg);
        sc.close();
    }
}
