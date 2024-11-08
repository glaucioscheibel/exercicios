package com.github.glaucioscheibel.vetores;

import java.util.Arrays;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = new int[10];

        // solução 1
        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = vetor1[i];
        }
        System.out.printf("Vetor 1: %s\n", Arrays.toString(vetor1));
        System.out.printf("Vetor 2: %s\n", Arrays.toString(vetor2));

        System.out.println();

        // solução 2 (específico no Java)
        vetor2 = new int[10];
        System.arraycopy(vetor1, 0, vetor2, 0, vetor1.length);
        System.out.printf("Vetor 1: %s\n", Arrays.toString(vetor1));
        System.out.printf("Vetor 2: %s\n", Arrays.toString(vetor2));
    }
}
