package cursoJavaCompleto.EstruturaCondicional;

public class Aula06 {
    //Expressão condicional ternária
    //( condição ) ? valor_se_verdadeiro : valor_se_falso
    public static void main(String[] args) {
        int numero = 5;
        int resultado = numero > 0 ? numero : 0;
        System.out.println("Resultado: " + resultado);

        String nome = "";
        String greeting = nome != null && !nome.isEmpty() ? "Olá, " + nome : "Olá, desconhecido";
        System.out.println("Greeting: " + greeting);
    }
}
