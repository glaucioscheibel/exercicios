package com.github.glaucioscheibel.matrizes;

import java.util.Arrays;

public class Exercicio06 {
    public static void main(String[] args) {
        int[][] a = {{2, 3, 1}, {-1, 0, 2}};
        int[][] b = {{1, -2}, {0, 5}, {4, 1}};
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Matriz A:");
        for (int[] al : a) {
            System.out.println(Arrays.toString(al));
        }
        System.out.println("Matriz B:");
        for (int[] bl : b) {
            System.out.println(Arrays.toString(bl));
        }
        System.out.println("Matriz C:");
        for (int[] cl : c) {
            System.out.println(Arrays.toString(cl));
        }
    }
}
