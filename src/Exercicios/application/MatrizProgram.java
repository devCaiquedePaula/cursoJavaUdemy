package Exercicios.application;

// Fazer um programa para ler dois numeros inteiros M e N,
// e depois ler uma matriz de M linhas por N colunas contendo numeros inteiros, podendo haver repetições.
// Para cada ocorrencia de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver.
public class MatrizProgram {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite o número de linhas (M): ");
        int m = sc.nextInt();
        System.out.print("Digite o número de colunas (N): ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o valor a ser procurado: ");
        int x = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Valor encontrado na posição (" + i + ", " + j + "):");
                    if (j > 0) System.out.println("Esquerda: " + matriz[i][j - 1]);
                    if (i > 0) System.out.println("Acima: " + matriz[i - 1][j]);
                    if (j < n - 1) System.out.println("Direita: " + matriz[i][j + 1]);
                    if (i < m - 1) System.out.println("Abaixo: " + matriz[i + 1][j]);
                }
            }
        }

        sc.close();
    }
}
