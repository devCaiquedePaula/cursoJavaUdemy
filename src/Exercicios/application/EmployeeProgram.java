package Exercicios.application;

import Exercicios.entities.EmployeeExercise02;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        EmployeeExercise02 employee = new EmployeeExercise02();

        System.out.println("Enter employee data:");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.printf("Updated data: %s, $ %.2f%n", employee.name, employee.netSalary());
    }

    public static class RectangleProgram {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            EmployeeExercise02.RectangleExercise01 rectangle = new EmployeeExercise02.RectangleExercise01();

            System.out.println("Enter rectangle width and height:");
            rectangle.width = sc.nextDouble();
            rectangle.height = sc.nextDouble();

            System.out.printf("AREA: %.2f%n", rectangle.area());
            System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
            System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());
        }
    }
}
