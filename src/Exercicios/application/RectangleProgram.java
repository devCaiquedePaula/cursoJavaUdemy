package Exercicios.application;

import Exercicios.entities.RectangleExercise01;

import java.util.Locale;
import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        RectangleExercise01 rectangle = new RectangleExercise01();

        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA: %.2f%n", rectangle.area());
        System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());
    }
}
