package cursoJavaCompleto.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {
    /*
    Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número não é negativo.");
        }
        scanner.close();
    }
}
