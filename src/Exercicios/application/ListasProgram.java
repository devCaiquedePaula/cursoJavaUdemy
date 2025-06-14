package Exercicios.application;

import Exercicios.entities.ListasExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListasProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ListasExercise> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            int finalId = id;
            while (list.stream().anyMatch(emp -> emp.getId() == finalId)) {
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            ListasExercise employee = new ListasExercise(id, name, salary);
            list.add(employee);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        ListasExercise employee = list.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);

        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.aumentarSalario(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (ListasExercise emp : list) {
            System.out.println(emp);
        }
        sc.close();
    }
}
