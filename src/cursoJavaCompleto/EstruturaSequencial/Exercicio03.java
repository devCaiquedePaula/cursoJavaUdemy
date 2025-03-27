package cursoJavaCompleto.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {
    /*
    * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o segundo número B: ");
        int B = scanner.nextInt();
        System.out.print("Digite o terceiro número C: ");
        int C = scanner.nextInt();
        System.out.print("Digite o quarto número D: ");
        int D = scanner.nextInt();
        int diferenca = (A * B) - (C * D);
        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);
    }
}
