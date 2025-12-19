package módulo_02.exercícios_de_fixação;

import java.util.Scanner;

public class problema_exemplo_telefonia {
    public static void main(String[] args) {
        /*
         * Uma empresa de telefonia cobra R$ 50,00 por um plano básico que inclui 100 minutos de chamadas.
         * Cada minuto adicional custa R$ 2,00. Escreva um programa que calcule o valor total da conta telefônica
         * com base no número de minutos utilizados pelo cliente.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de minutos utilizados: ");
        int minutos = scanner.nextInt();
        double planoBasico = 50.0;
        int minutosInclusos = 100;
        double custoMinutoAdicional = 2.0;
        double valorTotal;
        
        if (minutos <= minutosInclusos){
            valorTotal = planoBasico;
        } else {
            int minutosAdicionais = minutos - minutosInclusos;
            valorTotal = planoBasico + (custoMinutoAdicional * minutosAdicionais);
        }
        
        System.out.printf("O valor total da conta telefônica é: R$ %.2f%n", valorTotal);
        scanner.close();
    }
}
