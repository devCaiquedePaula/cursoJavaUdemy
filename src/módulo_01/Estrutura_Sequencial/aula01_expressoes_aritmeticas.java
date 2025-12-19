package módulo_01.Estrutura_Sequencial;

public class aula01_expressoes_aritmeticas {
    public static void main(String[] args) {
        // expressões aritméticas são aquelas que quando calculadas vão gerar um resultado → valor numérico
        int soma = 5 + 3; // adição
        System.out.println(soma);
        int subtracao = 10 - 4; // subtração
        System.out.println(subtracao);
        int multiplicacao = 6 * 7; // multiplicação
        System.out.println(multiplicacao);
        double divisao = 20.0 / 4.0; // divisão
        System.out.println(divisao);
        int modulo = 10 % 3; // módulo (resto da divisão)
        System.out.println(modulo);

        // ordem de precedência: (), *, /, %, +, -
        int resultado = (2 + 3) * 4 - 5 % 2;
        System.out.println(resultado);
    }
}
