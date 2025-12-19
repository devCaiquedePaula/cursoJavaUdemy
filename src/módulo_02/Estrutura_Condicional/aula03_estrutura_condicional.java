package módulo_02.Estrutura_Condicional;

import java.util.Scanner;

public class aula03_estrutura_condicional {
    public static void main(String[] args) {
        /* Estruturas Condicionais em Java, é uma estrutura de controle
         * que permite executar diferentes blocos de código
         * com base em condições específicas.
         * As principais estruturas condicionais em Java são:
         * - if: executa um bloco de código se uma condição for verdadeira.
         * - else if: permite verificar múltiplas condições.
         * - else: executa um bloco de código se todas as condições anteriores forem falsas.
         * - Operador ternário: uma forma simplificada de escrever uma estrutura condicional if-else.
         *
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo ou negativo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Estrutura condicional simplificada (operador ternário)
        String resultado = (numero % 2 == 0) ? "par" : "ímpar";
        System.out.println("O número é " + resultado + ".");
    }
}
