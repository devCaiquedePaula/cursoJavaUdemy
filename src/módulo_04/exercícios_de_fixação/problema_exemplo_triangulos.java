package módulo_04.exercícios_de_fixação;

import java.util.Locale;
import java.util.Scanner;

public class problema_exemplo_triangulos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do lados do triângulo X:");
        double xA = scanner.nextDouble();
        double xB = scanner.nextDouble();
        double xC = scanner.nextDouble();
        
        System.out.println("Digite o valor do lados do triângulo Y:");
        double yA = scanner.nextDouble();
        double yB = scanner.nextDouble();
        double yC = scanner.nextDouble();
        
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        
        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);
        
        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }
    }
}
