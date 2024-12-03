package com.github.glaucioscheibel.matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int ordem;
        Scanner input = new Scanner(System.in);
        System.out.print("Ordem da matriz identidade: ");
        ordem = input.nextInt();
        int[][] id = new int[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            id[i][i] = 1;
        }
        for (int[] linha : id) {
            System.out.println(Arrays.toString(linha));
        }
        input.close();
    }
}
