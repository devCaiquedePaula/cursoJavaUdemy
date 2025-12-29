package módulo_02;

public class extra_operadores_bitwise {
    /* Operadores Bitwise
    Os operadores bitwise são usados para manipular dados em nível de bits. 
    Eles operam diretamente nos bits individuais de números inteiros. 
    Aqui estão os principais operadores bitwise em Java:
    */
    public static void main(String[] args) {
        // 1. AND (&): Realiza uma operação AND bit a bit. O resultado é 1 se ambos os bits forem 1.
        // Exemplo:
        int a1 = 5; // 0101 em binário
        int b1 = 3; // 0011 em binário
        int resultado1 = a1 & b1; // resultado será 1 (0001 em binário)
        System.out.println(resultado1);
        // convertendo para binário
        System.out.println("Binário de " + resultado1 + " é: " + Integer.toBinaryString(resultado1));

        System.out.println("-------------------");
        
        // 2. OR (|): Realiza uma operação OR bit a bit. O resultado é 1 se pelo menos um dos bits for 1.
        // Exemplo:
        int a2 = 5; // 0101 em binário
        int b2 = 3; // 0011 em binário
        int resultado2 = a2 | b2; // resultado será 7 (0111 em binário)
        System.out.println(resultado2);
        // convertendo para binário
        System.out.println("Binário de " + resultado2 + " é: " + Integer.toBinaryString(resultado2));
        
        System.out.println("-------------------");
        
        // 3. XOR (^): Realiza uma operação XOR bit a bit. O resultado é
        // 1 se os bits forem diferentes.
        // Exemplo:
        int a3 = 5; // 0101 em binário
        int b3 = 3; // 0011 em binário
        int resultado3 = a3 ^ b3; // resultado será 6 (0110 em binário)
        System.out.println(resultado3);
        // convertendo para binário
        System.out.println("Binário de " + resultado3 + " é: " + Integer.toBinaryString(resultado3));  
    }
}
