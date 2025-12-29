package módulo_03.exercícios_de_fixação;

import java.util.Scanner;

public class problema_exemplo_soma_N_inteiros_for {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        
        int N = scanner.nextInt();
        int soma = 0;
        
        for (int i = 1; i <= N; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();
            soma += numero;
        }
        
        System.out.println("A soma dos " + N + " números inteiros é: " + soma);
        scanner.close();
    }
}