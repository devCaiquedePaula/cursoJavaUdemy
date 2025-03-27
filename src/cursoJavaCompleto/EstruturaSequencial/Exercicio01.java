package cursoJavaCompleto.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {
    //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    //mensagem explicativa,
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma dos números " + numero1 + " e " + numero2 + " é: " + soma);
        scanner.close();
    }
}
