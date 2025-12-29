package módulo_03;

import java.util.Locale;
import java.util.Scanner;

public class extra_como_utilizar_debug {
    // Como utilizar o debug no Java
    // Marcamos um breakpoint clicando na margem esquerda da linha desejada
    // Rodamos o programa em modo debug (botão de inseto)
    // Utilizamos F8 para avançar linha a linha
    // Utilizamos F7 para entrar nos métodos
    // Utilizamos Shift + F8 para sair de métodos
    // Podemos observar o valor das variáveis passando o mouse sobre elas
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();
        
        double area = largura * comprimento;
        double preco = area * metroQuadrado;
        
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PREÇO = %.2f%n", preco);
        
        sc.close();
    }
}
