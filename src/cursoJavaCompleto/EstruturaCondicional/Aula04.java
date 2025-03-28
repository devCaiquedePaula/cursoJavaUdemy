package cursoJavaCompleto.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula04 {
    //Sintaxe opcional: Operadores de atribuição cumulativa
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int minutes = scanner.nextInt();
        double conta = 50.0;
        if (minutes > 100){
            conta += (minutes -100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        scanner.close();

        //Operadores de atribuição acumulativa
        int a = 2;
        int b = 2;
        a += b; // a = a + b
        a -= b; // a = a - b
        a *= b; // a = a * b
        a /= b; // a = a / b
        a %= b; // a = a % b
    }
}
