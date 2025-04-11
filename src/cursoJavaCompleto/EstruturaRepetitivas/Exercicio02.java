package cursoJavaCompleto.EstruturaRepetitivas;

import java.util.Scanner;

public class Exercicio02 {
    /*
     * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
     * Perguntar se o usuario desejar repetir (S/N).
     * O programa deve continuar até que o usuario digite "S".
     * O programa deve ser encerrado quando o usuario digitar "N".
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("Temperatura em Fahrenheit: %.2f%n", fahrenheit);

            System.out.print("Deseja continuar? (S/N): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("----- Programa encerrado! -----");
        sc.close();
    }
}
