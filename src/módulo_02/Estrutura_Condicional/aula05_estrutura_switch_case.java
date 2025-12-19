package módulo_02.Estrutura_Condicional;

import java.util.Scanner;

public class aula05_estrutura_switch_case {
    public static void main(String[] args) {
        // Estrutura Switch Case em Java
        // A estrutura switch case é usada para selecionar uma entre várias opções com base no valor de
        // uma variável ou expressão. É uma alternativa ao uso de múltiplas instruções if-else.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7 para representar o dia da semana (Sendo 1 = Domingo e 7 = Sábado): ");
        int diaDaSemanaInput = scanner.nextInt();
        String nomeDoDia;

        switch (diaDaSemanaInput) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terça-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sexta-feira";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            default:
                nomeDoDia = "Dia inválido";
                break;
        }

        System.out.println("O dia da semana é: " + nomeDoDia);
    }
}
