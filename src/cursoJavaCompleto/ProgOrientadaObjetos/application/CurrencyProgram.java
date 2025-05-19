package cursoJavaCompleto.ProgOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

import static cursoJavaCompleto.ProgOrientadaObjetos.utils.CurrencyConverter.convertToReais;

public class CurrencyProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dollar price: ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();
        double reais = convertToReais(dollars, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", reais);
    }
}
