package módulo_01.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class aula05_entrada_de_dados {
    /* Entrada de dados pode ser feita através da classe Scanner
     * que faz parte do pacote java.util.
     * Para utilizá-la, é necessário importá-la no início do código.
     * Exemplo:
     * import java.util.Scanner;
     * Em seguida, é possível criar um objeto Scanner para ler dados do teclado.
     * Exemplo:
     * Scanner scanner = new Scanner(System.in);
     * Com o objeto scanner, é possível ler diferentes tipos de dados, como:
     * - scanner.nextLine() para ler uma linha de texto (String)
     * - scanner.nextInt() para ler um número inteiro (int)
     * - scanner.nextDouble() para ler um número decimal (double)
     * - scanner.nextBoolean() para ler um valor booleano (true/false)
     * Após a leitura dos dados, é importante fechar o scanner para liberar recursos.
     * Exemplo:
     * scanner.close();
     * */
    public static void main(String[] args) {
        // Definindo o locale para garantir o uso do ponto como separador decimal
        // Importando e criando o objeto Scanner
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        // Lendo uma linha de texto
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        // Lendo um número inteiro
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
                
        // Lendo um número decimal
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        
        // Lendo um valor booleano
        System.out.print("Você é estudante? (S/N): ");
        String estudanteInput = scanner.next();
        boolean estudante = estudanteInput.equalsIgnoreCase("S");
        
        System.out.println("\n--- Dados Informados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Estudante: " + (estudante ? "Sim" : "Não"));

        System.out.println("------------------------------------");
        // Para ler um texto até a quebra de linha 
        String c1, c2, c3;
        c1 = scanner.nextLine();
        c2 = scanner.nextLine();
        c3 = scanner.nextLine();
        
        System.out.println("Você digitou:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        // Fechando o scanner
        scanner.close();
    }
}
