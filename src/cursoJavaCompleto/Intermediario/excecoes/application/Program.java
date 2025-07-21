package cursoJavaCompleto.Intermediario.excecoes.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();
        System.out.println("End of program execution.");
    }

    public static void method1() {
        System.out.println("***METHOD1 STARTED***");
        method2();
        System.out.println("***METHOD1 ENDED***");
    }

    public static void method2() {
        System.out.println("***METHOD2 STARTED***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vector = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch! Please enter a valid integer for the position.");
        }
        sc.close();
        System.out.println("***METHOD2 ENDED***");
    }
}