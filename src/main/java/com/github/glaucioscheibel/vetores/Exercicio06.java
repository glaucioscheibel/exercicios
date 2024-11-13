package com.github.glaucioscheibel.vetores;

import java.util.Arrays;

public class Exercicio06 {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(Arrays.toString(v));
        int aux = 0;
        for (int i = 0, n = v.length / 2; i < n; i++) {
            aux = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = aux;
        }
        System.out.println(Arrays.toString(v));
    }
}
