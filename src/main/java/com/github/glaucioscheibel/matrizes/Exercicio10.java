package com.github.glaucioscheibel.matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int ordem;
        Scanner input = new Scanner(System.in);
        System.out.print("Ordem do triângulo de Pascal: ");
        ordem = input.nextInt();
        int[][] pascal = new int[ordem][];
        for (int i = 0; i < ordem; i++) {
            pascal[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
                }
            }
        }
        for (int[] linha : pascal) {
            System.out.println(Arrays.toString(linha));
        }
        input.close();
    }
}
