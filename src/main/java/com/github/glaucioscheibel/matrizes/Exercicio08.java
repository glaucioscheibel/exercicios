package com.github.glaucioscheibel.matrizes;

public class Exercicio08 {
    static void main() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int r : new int[] {90, 180, 270}) {
            int n = matriz.length;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = matriz[i][j];
                    matriz[i][j] = matriz[i][n - j - 1];
                    matriz[i][n - j - 1] = temp;
                }
            }
            System.out.printf("Rotacionado em %d°:%n", r);
            for (int[] ints : matriz) {
                for (int anInt : ints) {
                    System.out.printf("%d ", anInt);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
