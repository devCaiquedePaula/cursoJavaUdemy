package módulo_03.Estrutura_Repetitivas;

public class aula02_for {
    /* Estrutura de repetição FOR
     * A estrutura de repetição FOR é utilizada para executar um bloco de código um número
     * determinado de vezes. A sintaxe básica do FOR em Java é a seguinte:
     * for (inicialização; condição; incremento) {
     *     // bloco de código a ser executado
     * }
     * QUANDO USAR: quando se sabe previamente a quantidade de repetições necessárias.
     * */
    public static void main(String[] args) {

        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Contador: " + contador);
        }

        System.out.println("---");

        // Contagem regressiva
        for (int i = 10; i >= 0; i--) {
            System.out.println("Contagem regressiva: " + i);
            if (i == 0) System.out.println("Ignite!");
        }
    }
}
