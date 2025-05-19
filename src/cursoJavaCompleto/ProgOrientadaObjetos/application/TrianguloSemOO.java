package cursoJavaCompleto.ProgOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

public class TrianguloSemOO {
    //Fazer um programa para ler as medidas dos lados de dois triangulos X e Y. Em seguida, mostrar o valor
    //das areas dos triangulos X e Y. E dizer qual dos dois possuui a maior area.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com as medidas do triangulo X: ");
        double aX = sc.nextDouble();
        double bX = sc.nextDouble();
        double cX = sc.nextDouble();
        System.out.println("Entre com as medidas do triangulo Y: ");
        double aY = sc.nextDouble();
        double bY = sc.nextDouble();
        double cY = sc.nextDouble();
        double areaX = (aX + bX + cX) / 2;
        double areaY = (aY + bY + cY) / 2;
        areaX = Math.sqrt(areaX * (areaX - aX) * (areaX - bX) * (areaX - cX));
        areaY = Math.sqrt(areaY * (areaY - aY) * (areaY - bY) * (areaY - cY));
        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Triangulo X possui a maior area.");
        } else if (areaY > areaX) {
            System.out.println("Triangulo Y possui a maior area.");
        } else {
            System.out.println("Os triangulos possuem areas iguais.");
        }
        sc.close();
    }
}
