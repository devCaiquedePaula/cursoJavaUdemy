package cursoJavaCompleto.EstruturaRepetitivas;

import java.util.Scanner;

public class Aula01 {
    //Estrutura repetitiva WHILE
    /*
    while (condicao) {
        // Executa ação
        // Incrementa ou decrementa o contador
    }
    Fazer um programa que leia numeros inteiros até que o um zero seja lido
    Ao final mostrar a soma dos numeros lidos
     **/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = s.nextInt();
        int soma = 0;
        while (x != 0) {
            System.out.println("Número lido: " + x);
            soma += x;
            System.out.print("Digite um número: ");
            x = s.nextInt();
        }
        System.out.println("----------------");
        System.out.println("Fim da leitura!");
        System.out.println("Soma de todos os números: " + soma);
        s.close();
    }
}
