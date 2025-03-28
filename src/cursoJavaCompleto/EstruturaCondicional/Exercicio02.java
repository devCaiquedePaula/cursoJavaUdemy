package cursoJavaCompleto.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {
    /*
    Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        scanner.close();
    }
}
