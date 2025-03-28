package cursoJavaCompleto.EstruturaCondicional;

import java.util.Scanner;

public class Aula05 {
    //Sintaxe opcional: estrutura switch-case
    /*
    Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1 = domingo, 2 = segunda, etc)
    Escrever na tela o dia da semana correspondente
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");

        int diaDaSemana = scanner.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Dia da semana: Domingo");
                break;
            case 2:
                System.out.println("Dia da semana: Segunda");
                break;
            case 3:
                System.out.println("Dia da semana: Terça");
                break;
            case 4:
                System.out.println("Dia da semana: Quarta");
                break;
            case 5:
                System.out.println("Dia da semana: Quinta");
                break;
            case 6:
                System.out.println("Dia da semana: Sexta");
                break;
            case 7:
                System.out.println("Dia da semana: Sábado");
                break;
            default:
                System.out.println("Dia inválido. Digite um número de 1 a 7.");
                break;
        }
    }
}
