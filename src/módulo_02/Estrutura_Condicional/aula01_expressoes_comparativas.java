package módulo_02.Estrutura_Condicional;

public class aula01_expressoes_comparativas {
    public static void main(String[] args) {
        // expressões comparativas são aquelas que quando calculadas vão gerar um resultado → valor booleano (true ou false)
        int a = 5;
        int b = 10;

        boolean igual = (a == b); // igual
        System.out.println("a é igual a b? " + igual);

        boolean diferente = (a != b); // diferente
        System.out.println("a é diferente de b? " + diferente);

        boolean maior = (a > b); // maior que
        System.out.println("a é maior que b? " + maior);

        boolean menor = (a < b); // menor que
        System.out.println("a é menor que b? " + menor);

        boolean maiorOuIgual = (a >= b); // maior ou igual a
        System.out.println("a é maior ou igual a b? " + maiorOuIgual);

        boolean menorOuIgual = (a <= b); // menor ou igual a
        System.out.println("a é menor ou igual a b? " + menorOuIgual);
    }
}
