package módulo_04.Introdução_à_programação_orientada_a_objetos.aula_03_membros_estaticos.application;

import módulo_04.Introdução_à_programação_orientada_a_objetos.aula_03_membros_estaticos.utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class version02_cincunferencia {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calculator  = new Calculator();
        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        double c = calculator.cincumference(radius);
        double v = calculator.volume(radius);
        
        System.out.printf("CIRCUMFERENCE: %.2f%n", c);
        System.out.printf("VOLUME: %.2f%n", v);
        System.out.printf("PI VALUE: %.2f%n", Math.PI);
    }
}
