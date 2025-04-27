package com.github.glaucioscheibel.vetores;

import java.util.Arrays;

public class Exercicio09 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 20, 30, 50};
        int[] b = {6, 7, 8, 9, 10, 25, 35, 55, 65, 200};
        int[] c = new int[a.length + b.length];
        int ai = 0;
        int bi = 0;
        int ci = 0;
        while (ai < a.length && bi < b.length) {
            if (a[ai] < b[bi]) {
                c[ci] = a[ai];
                ai++;
            } else {
                c[ci] = b[bi];
                bi++;
            }
            ci++;
        }
        while (ai < a.length) {
            c[ci] = a[ai];
            ai++;
            ci++;
        }
        while (bi < b.length) {
            c[ci] = b[bi];
            bi++;
            ci++;
        }
        System.out.printf("Mesclado: %s\n", Arrays.toString(c));
    }
}
