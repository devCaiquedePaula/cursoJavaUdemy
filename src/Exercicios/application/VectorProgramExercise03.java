package Exercicios.application;

import Exercicios.entities.VectorExercise03;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.
public class VectorProgramExercise03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        VectorExercise03[] vect = new VectorExercise03[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %dª pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine(); // Consume the newline character left by nextInt()
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new VectorExercise03(name, age, height);
        }
        double sum = 0.0;
        int countUnder16 = 0;
        System.out.println();
        System.out.println("Pessoas com menos de 16 anos:");
        for (int i = 0; i < n; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
                countUnder16++;
            }
            sum += vect[i].getHeight();
        }
        System.out.println();
        double averageHeight = sum / n;
        System.out.printf("Altura média: %.2f\n", averageHeight);
        if (countUnder16 > 0) {
            double percentageUnder16 = (double) countUnder16 / n * 100.0;
            System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%\n", percentageUnder16);
        } else {
            System.out.println("Não há pessoas com menos de 16 anos.");
        }
        sc.close();
    }
}
