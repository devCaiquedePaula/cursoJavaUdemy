package cursoJavaCompleto.EstruturaSequencial;

import java.util.Locale;

public class aula02 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Este é um exemplo de impressão de texto");

        int y = 32;
        System.out.println(y);

        double x = 10.35485;
        System.out.println(x);
        //exibir o número de X somente com 2 casas decimais.
        System.out.printf("%.2f%n", x);
        //exibir o número de X somente com 4 casas decimais.
        System.out.printf("%.4f%n", x);

        // definir o locale para US (American) para formatar o número de X com 4 casas decimais.
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        String name = "Caique";
        int age = 26;
        double salary = 6000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", name, age, salary);
    }
}
