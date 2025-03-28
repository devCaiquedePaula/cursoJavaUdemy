package cursoJavaCompleto.EstruturaCondicional;

import java.util.Scanner;

public class Aula03 {
    //Estruturas Condicionais (IF-ELSE)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();

        // Estrutura IF-ELSE

        if (idade >= 18 && idade <= 59) {
            System.out.println("Você é Adulto(a).");
        } else if (idade >= 60) {
            System.out.println("Você é Idoso(a).");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
