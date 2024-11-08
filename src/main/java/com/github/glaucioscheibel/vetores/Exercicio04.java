package com.github.glaucioscheibel.vetores;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int[] v1 = new int[15];
        int[] v2 = new int[15];
        int vezes = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < v1.length; i++) {
            System.out.printf("v1[%d]: ", i);
            v1[i] = input.nextInt();
        }
        for (int i = 0; i < v2.length; i++) {
            System.out.printf("v2[%d]: ", i);
            v2[i] = input.nextInt();
        }
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == v2[i]) {
                vezes++;
            }
        }
        System.out.printf("v1 e v2 possuem %d valores iguais nas mesmas posições\n", vezes);
        input.close();
    }
}
