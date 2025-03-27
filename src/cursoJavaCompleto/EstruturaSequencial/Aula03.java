package cursoJavaCompleto.EstruturaSequencial;

public class Aula03 {
    public static void main(String[] args) {
        int x1, y1;
        x1 = 5;
        y1 = 2 * x1 + 1;
        System.out.println("X = " + x1);
        System.out.println("Resultado: " + y1);

        System.out.println("------------------------------");

        int x2;
        double y2;
        x2 = 7;
        y2 = 3 * x2;
        System.out.println("X = " + x2);
        System.out.println("Resultado: " + y2);

        System.out.println("------------------------------");

        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        System.out.println("------------------------------");

        //casting (conversão de tipo de dados)
        int c, d;
        double result;
        c = 5;
        d = 2;
        result = (double) c / d;
        System.out.println("Resultado: " + result);
    }
}
