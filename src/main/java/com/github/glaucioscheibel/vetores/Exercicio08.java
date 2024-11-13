package com.github.glaucioscheibel.vetores;

import java.util.ArrayList;
import java.util.List;

public class Exercicio08 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        for (int n : numeros) {
            if (n % 2 == 0) {
                pares.add(n);
            } else {
                impares.add(n);
            }
        }
        System.out.printf("Pares: %s\n", pares);
        System.out.printf("Impares: %s\n", impares);
    }
}
