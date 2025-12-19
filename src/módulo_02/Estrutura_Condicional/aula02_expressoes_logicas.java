package módulo_02.Estrutura_Condicional;

public class aula02_expressoes_logicas {
    public static void main(String[] args) {
        // Expressões Lógicas em Java
        // Operadores Lógicos:
        // && (E) - Retorna true se ambas as expressões forem verdadeiras.
        // || (OU) - Retorna true se pelo menos uma das expressões for verdadeira.
        // ! (NÃO) - Inverte o valor lógico da expressão.
        /*
        Tabela Verdade:
        A       B       A && B     A || B     !A
        true    true    true       true       false
        true    false   false      true       false
        false   true    false      true       true
        false   false   false      false      true
        * */

        boolean expr1 = (5 > 3) && (8 > 5);
        boolean expr2 = (5 > 3) || (8 < 5); 
        boolean expr3 = !(5 > 3);            

        System.out.println("Resultado da expressão 1 (5 > 3 && 8 > 5): " + expr1);
        System.out.println("Resultado da expressão 2 (5 > 3 || 8 < 5): " + expr2);
        System.out.println("Resultado da expressão 3 (!(5 > 3)): " + expr3);
    }
}
