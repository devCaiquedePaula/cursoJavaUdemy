package módulo_01.Estrutura_Sequencial;

public class aula06_funcao_matematicas {
    public static void main(String[] args) {
        double a = 25;
        double x = Math.sqrt(a);
        System.out.println("a raiz quadrada de " + a + " é igual a " + x);

        double b = 5.0;
        double y = Math.pow(b, 3);
        System.out.println(b + " elevado a 3 é igual a " + y);

        double c = 4.3;
        double z = Math.ceil(c);
        System.out.println("Arredondando " + c + " para cima, o valor é " + z);

        double d = 4.7;
        double w = Math.floor(d);
        System.out.println("Arredondando " + d + " para baixo, o valor é " + w);

        double e = 3.5;
        double g = Math.abs(e);
        System.out.println("O valor absoluto de " + e + " é " + g);

        System.out.println("------------------------------------");
        // Funções matemáticas comuns em Java - Bhaskara
        double A = 1.0;
        double B = -3.0;
        double C = -4.0;
        double delta = Math.pow(B, 2) - 4 * A * C;
        System.out.println("Valor de delta: " + delta);
        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }
}
