package módulo_01.Estrutura_Sequencial;

public class aula04_processamento_de_dados {
    /* Processamento de dados → manipulação e transformação de dados para obter informações úteis
    Pode ser feito através do comando de atribuição (=) e expressões aritméticas
    Sintaxe:
        <variável> = <expressão>;
    */
    public static void main(String[] args) {
        // Exemplo 01: Atribuição simples
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y (2 * x): " + y);

        // Exemplo 02: Processamento com expressões aritméticas
        double salarioBase = 3000.0;
        double bonus = 500.0;
        double salarioTotal = salarioBase + bonus; // soma
        System.out.println("Salário Total: " + salarioTotal);

        /* Exemplo 03: Cálculo de área de trapézio
         * A = (b * B) / 2 * h
         * onde:
         * A = área do trapézio
         * b = base menor
         * B = base maior
         * h = altura
         * */
        double area, baseMenor, baseMaior, altura;
        baseMenor = 6.0;
        baseMaior = 8.0;
        altura = 5.0;
        area = (baseMenor + baseMaior) / 2 * altura;
        System.out.println("Área do trapézio: " + area);
    }
}
