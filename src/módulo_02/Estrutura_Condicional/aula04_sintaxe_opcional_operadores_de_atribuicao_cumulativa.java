package módulo_02.Estrutura_Condicional;

public class aula04_sintaxe_opcional_operadores_de_atribuicao_cumulativa {
    public static void main(String[] args) {
        // Operadores de Atribuição Cumulativa em Java
        // += : adiciona o valor à variável e atribui o resultado à variável.
        // -= : subtrai o valor da variável e atribui o resultado à variável.
        // *= : multiplica o valor da variável e atribui o resultado à variável.
        // /= : divide o valor da variável e atribui o resultado à variável.
        // %= : calcula o resto da divisão da variável e atribui o resultado à variável.
        
        int a = 10;
        System.out.println("Valor inicial de a: " + a);
        
        a += 5; // a = a + 5
        System.out.println("Após a += 5, valor de a: " + a);
        
        a -= 3; // a = a - 3
        System.out.println("Após a -= 3, valor de a: " + a);
        
        a *= 2; // a = a * 2
        System.out.println("Após a *= 2, valor de a: " + a);
        
        a /= 4; // a = a / 4
        System.out.println("Após a /= 4, valor de a: " + a);
        
        a %= 3; // a = a % 3
        System.out.println("Após a %= 3, valor de a: " + a);
    }
}
