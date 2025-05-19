package cursoJavaCompleto.ProgOrientadaObjetos.application;

import cursoJavaCompleto.ProgOrientadaObjetos.entities.StudentExercise03;

import java.util.Locale;
import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        StudentExercise03 student = new StudentExercise03();

        System.out.println("Enter student name: ");
        student.name = sc.nextLine();
        System.out.println("Enter first trimester grade: ");
        student.firstTrimester = sc.nextDouble();
        System.out.println("Enter second trimester grade: ");
        student.secondTrimester = sc.nextDouble();
        System.out.println("Enter third trimester grade: ");
        student.thirdTrimester = sc.nextDouble();

        System.out.printf("Final grade: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n", student.missingPoints());
        } else {
            System.out.println("Passed");
        }
    }
}
