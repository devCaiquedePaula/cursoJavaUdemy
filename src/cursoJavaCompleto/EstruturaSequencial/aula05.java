package cursoJavaCompleto.EstruturaSequencial;

public class aula05 {
    //funções matemáticas
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        System.out.println("-----------------------");

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println("Potência de " + x + " elevado a " + y + " = " + A);
        System.out.println("Potência de " + x + " elevado ao quadrado = " + B);
        System.out.println("Potência de 5 elevado ao quadrado = " + C);

        System.out.println("-----------------------");

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}
