package Exercicios.entities;

public class EmployeeExercise02 {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public static class RectangleExercise01 {
        public double width;
        public double height;

        public double area() {
            return width * height;
        }

        public double perimeter() {
            return 2 * (width + height);
        }

        public double diagonal() {
            return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        }
    }
}
