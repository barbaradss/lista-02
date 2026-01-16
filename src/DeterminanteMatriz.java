public class DeterminanteMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int determinante = calcularDeterminante(matriz);

        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nDeterminante = " + determinante);
    }

    public static int calcularDeterminante(int[][] matriz) {
        int[][] matrizEstendida = estenderMatriz(matriz);
        int somaPrincipal = 0;
        for (int desloc = 0; desloc < 3; desloc++) {
            somaPrincipal += produtoDiagonal(matrizEstendida, desloc);
        }
        int somaSecundaria = 0;
        for (int desloc = 0; desloc < 3; desloc++) {
            somaSecundaria += produtoDiagonalOposta(matrizEstendida, desloc);
        }
        return somaPrincipal - somaSecundaria;
    }

    private static int[][] estenderMatriz(int[][] matriz) {
        int[][] matrizEstendida = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matrizEstendida[i][j] = matriz[i][j % 3];
            }
        }
        return matrizEstendida;
    }

    private static int produtoDiagonal(int[][] matriz, int deslocamento) {
        int produto = 1;
        for (int i = 0; i < 3; i++) {
            produto *= matriz[i][i+deslocamento];
        }
        return produto;
    }

    private static int produtoDiagonalOposta(int[][] matriz, int deslocamento) {
        int produto = 1;
        for (int i = 0; i < 3; i++) {
            produto *= matriz[2-i][i+deslocamento];
        }
        return produto;
    }
}
