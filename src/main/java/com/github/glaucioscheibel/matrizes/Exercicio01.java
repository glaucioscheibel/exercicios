package com.github.glaucioscheibel.matrizes;

public class Exercicio01 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int[] linha : matriz) {
            for (int numero : linha) {
                System.out.println(numero);
            }
        }
    }
}
