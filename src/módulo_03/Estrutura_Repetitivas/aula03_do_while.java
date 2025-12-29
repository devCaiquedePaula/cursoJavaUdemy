package módulo_03.Estrutura_Repetitivas;

public class aula03_do_while {
    /* Estrutura de repetição DO WHILE
     * A estrutura de repetição DO WHILE é semelhante ao WHILE, mas a condição é verificada
     * após a execução do bloco de código. Isso garante que o bloco de código seja executado
     * pelo menos uma vez. A sintaxe básica do DO WHILE em Java é a seguinte:
     * do {
     *     // bloco de código a ser executado
     * } while (condição);
     * QUANDO USAR: quando se deseja garantir que o bloco de código seja executado pelo menos uma vez,
     * independentemente da condição inicial.
     * */
    public static void main(String[] args) {

        int contador = 1; // variável de controle

        do {
            System.out.println("Contador: " + contador);
            contador++; // incrementa a variável de controle
        } while (contador <= 5); // condição de repetição
    }
}
