package cursoJavaCompleto.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {
    //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
    //casas decimais
    //Fórmula da área: area = π . raio2
    //Considere o valor de π = 3.14159
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Área do círculo: %.4f%n", area);
        scanner.close();
    }
}
