package cursoJavaCompleto.ProgOrientadaObjetos.application;

import cursoJavaCompleto.ProgOrientadaObjetos.utils.Radius;

import java.util.Locale;
import java.util.Scanner;

public class RadiusProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f%n", Radius.circumference(radius));
        System.out.printf("Volume: %.2f%n", Radius.volume(radius));
        Radius.showPI();

        sc.close();
    }
}
