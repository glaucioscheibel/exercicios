package com.github.glaucioscheibel.matrizes;

public class Exercicio02 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int somaPrimeiraColuna = 0;
        int produtoPrimeiraLinha = 1;
        int total = 0;
        int produtoDiagonal = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0) {
                    somaPrimeiraColuna += matriz[i][j];
                }
                if (i == 0) {
                    produtoPrimeiraLinha *= matriz[i][j];
                }
                if (i == j) {
                    produtoDiagonal *= matriz[i][j];
                }
                total += matriz[i][j];
            }
        }
        System.out.printf("A soma dos elementos da primeira coluna: %d\n", somaPrimeiraColuna);
        System.out.printf("O produto dos elementos da primeira linha: %d\n", produtoPrimeiraLinha);
        System.out.printf("A soma de todos os elementos: %d\n", total);
        System.out.printf("O produto da diagonal principal: %d\n", produtoDiagonal);
    }
}
