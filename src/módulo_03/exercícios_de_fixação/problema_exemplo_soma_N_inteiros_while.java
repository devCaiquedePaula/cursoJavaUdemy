package módulo_03.exercícios_de_fixação;

import java.util.Scanner;

public class problema_exemplo_soma_N_inteiros_while {
    public static void main(String[] args) {
        // Fazer um programa para ler uma quantidade indeterminada de números inteiros positivos.
        // O programa vai parar quando o usuário digitar o valor 0. No final, mostrar a soma dos números digitados.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro positivo N:");
        int N = scanner.nextInt();
        int soma = 0;
        
        while (N != 0) {
            soma += N;
            System.out.println("Digite mais um número inteiro positivo (ou 0 para sair):");
            N = scanner.nextInt();
        }
        
        System.out.println("A soma dos números digitados é: " + soma);
        scanner.close();
    }
}
