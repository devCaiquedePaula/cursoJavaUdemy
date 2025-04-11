package cursoJavaCompleto.EstruturaRepetitivas;

import java.util.Scanner;

public class Aula02 {
    //Estrutura de repetição FOR
    //Fazer um programa que lê um valor inteiro N e depois N números interiros.
    //Calcular e mostrar a soma dos N números lidos.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de números a serem lidos: ");
        int N = teclado.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = teclado.nextInt();
            soma += numero;
        }

        System.out.println("Soma dos " + N + " números: " + soma);
        teclado.close();
    }
}
