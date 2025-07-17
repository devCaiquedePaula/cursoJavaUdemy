package cursoJavaCompleto.ProgOrientadaObjetos2.application;

import cursoJavaCompleto.ProgOrientadaObjetos2.entities.Circle;
import cursoJavaCompleto.ProgOrientadaObjetos2.entities.Rectangle;
import cursoJavaCompleto.ProgOrientadaObjetos2.entities.Shape;
import cursoJavaCompleto.ProgOrientadaObjetos2.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ShapeProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Circle or Rectangle (c/r)? ");
            char type = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();

            if (type == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(Color.valueOf(color), radius));
            } else {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(Color.valueOf(color), width, height));
            }
        }
        System.out.println("-----------------------");
        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }
        sc.close();
    }
}
