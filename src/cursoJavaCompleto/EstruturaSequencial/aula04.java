package cursoJavaCompleto.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class aula04 {
    public static void main(String[] args) {
        //objeto para fazer entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("You have typed " + x);

        System.out.println("-----------------");

        int y ;
        y = sc.nextInt();
        System.out.println("You have typed " + y);

        System.out.println("-----------------");

        double z ;
        z = sc.nextDouble();
        System.out.println("You have typed " + z);

        System.out.println("-----------------");

        char c ;
        c = sc.next().charAt(0);
        System.out.println("You have typed " + c);
        sc.close();
    }
}
