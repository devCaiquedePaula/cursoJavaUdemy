package módulo_03.exercícios_de_fixação;

import java.util.Locale;
import java.util.Scanner;

public class problema_exemplo_temperatura_do_while {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        
        do {
            double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
            System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", temperaturaFahrenheit);
            System.out.println("Deseja repetir (s/n)? ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("Digite a temperatura em Celsius: ");
            temperaturaCelsius = scanner.nextDouble();
        } while (true);
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
