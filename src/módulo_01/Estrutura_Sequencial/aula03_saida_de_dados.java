package módulo_01.Estrutura_Sequencial;

public class aula03_saida_de_dados {
    public static void main(String[] args) {
        // Saida de dados → um programa vai exibir informações para o usuário
        System.out.print("Olá, mundo!"); // imprime sem pular linha
        System.out.println("Olá, mundo!"); // imprime e pula linha
        System.out.printf("Olá, %s! Você tem %d anos.%n", "Caique", 27); // formatação de saída
        
        // Podemos usar especificadores de formato para diferentes tipos de dados
        String nome = "Caique";
        int idade = 27;
        double altura = 1.80;
        System.out.printf("Nome: %s, Idade: %d, Altura: %.2f metros.%n", nome, idade, altura); // .2f para 2 casas decimais
        
        // %f - ponto flutuante
        // %d - inteiro
        // %s - string
        // %c - caractere
        // %b - booleano
        
        // Podemos também usar escape sequences para formatar a saída
        System.out.println("Linha 1\nLinha 2"); // \n para nova linha
        System.out.println("Coluna 1\tColuna 2"); // \t para tabulação
    }
}
