package módulo_03.Estrutura_Repetitivas;

public class aula01_while {
    /* Estrutura de repetição WHILE
    * A estrutura de repetição WHILE é utilizada para executar um bloco de código enquanto uma
    * determinada condição for verdadeira. A sintaxe básica do WHILE em Java é a seguinte:
    * while (condição) {
    *     // bloco de código a ser executado enquanto a condição for verdadeira
    * }
    * QUANDO USAR: quando não se sabe previamente a quantidade de repetições necessárias.
    * */
    public static void main(String[] args) {
        int contador = 1; // variável de controle
        while (contador <= 5) { // condição de repetição
            System.out.println("Contador: " + contador);
            contador++; // incrementa a variável de controle
        } 
    }
}
