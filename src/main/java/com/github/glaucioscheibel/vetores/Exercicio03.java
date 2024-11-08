package com.github.glaucioscheibel.vetores;

import java.util.Arrays;

public class Exercicio03 {
    public static void main(String[] args) {
        int[] vetor1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] vetor2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] vetor3 = new int[10];
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
        System.out.printf("Vetor 1: %s\n", Arrays.toString(vetor1));
        System.out.printf("Vetor 2: %s\n", Arrays.toString(vetor2));
        System.out.printf("Vetor 3: %s\n", Arrays.toString(vetor3));
    }
}
