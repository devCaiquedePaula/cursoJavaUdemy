package cursoJavaCompleto.EstruturaCondicional;

public class Aula02 {
    //Expressões Lógicas
    /*
     * Operadores Lógicos:
     * AND (&&) - Retorna verdadeiro se todos os operandos forem verdadeiros
     * OR (||) - Retorna verdadeiro se qualquer um dos operandos forem verdadeiros
     * NOT (!) - Inverte o valor booleano
    * */
    public static void main(String[] args) {
        // AND
        boolean resultadoAnd = true && true;
        System.out.println("Resultado AND: " + resultadoAnd);

        // OR
        boolean resultadoOr = true || false;
        System.out.println("Resultado OR: " + resultadoOr);

        // NOT
        boolean resultadoNot =!true;
        System.out.println("Resultado NOT: " + resultadoNot);

        // Operadores de Comparação
        int num1 = 10;
        int num2 = 20;

        // Maior que
        boolean resultadoMaiorQue = num1 > num2;
        System.out.println("Resultado maior que: " + resultadoMaiorQue);

        // Menor que
        boolean resultadoMenorQue = num1 < num2;
        System.out.println("Resultado menor que: " + resultadoMenorQue);

        // Igualdade
        boolean resultadoIgual = num1 == num2;
        System.out.println("Resultado igual: " + resultadoIgual);

        // Diferente
        boolean resultadoDiferente = num1!= num2;
        System.out.println("Resultado diferente: " + resultadoDiferente);

        // Maior ou Igual
        boolean resultadoMaiorOuIgual = num1 >= num2;
        System.out.println("Resultado maior ou igual: " + resultadoMaiorOuIgual);

        // Menor ou Igual
        boolean resultadoMenorOuIgual = num1 <= num2;
        System.out.println("Resultado menor ou igual: " + resultadoMenorOuIgual);
    }
}
