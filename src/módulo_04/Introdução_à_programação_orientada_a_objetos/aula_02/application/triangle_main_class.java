package módulo_04.Introdução_à_programação_orientada_a_objetos.aula_02.application;

import módulo_04.Introdução_à_programação_orientada_a_objetos.aula_02.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class triangle_main_class {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle(); // Instanciando o objeto x da classe Triangle
        Triangle y = new Triangle(); // Instanciando o objeto y da classe Triangle
        
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); // Acessando os atributos do objeto x
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble(); // Acessando os atributos do objeto y
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaX = x.area(); // Chamando o method area() do objeto x
        double areaY = y.area();
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
    }
}
