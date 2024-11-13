package com.github.glaucioscheibel.vetores;

import java.util.ArrayList;
import java.util.List;

public class Exercicio11 {
    public static void main(String[] args) {
        int[] a = {1, 8, 2, 4, 3, 4, 2, 5, 1};
        int[] b = {3, 3, 7, 5, 2, 3, 3, 7};
        List<Integer> soma = new ArrayList<>();
        int ai = a.length - 1;
        int bi = b.length - 1;
        int vai1 = 0;
        while (ai >= 0 || bi >= 0 || vai1 > 0) {
            int aux = 0;
            if (ai >= 0 && bi >= 0) {
                aux = a[ai] + b[bi] + vai1;
            } else if (ai >= 0) {
                aux = a[ai] + vai1;
            } else if (bi >= 0) {
                aux = b[bi] + vai1;
            } else if (vai1 > 0) {
                aux = vai1;
            }
            if (aux > 10) {
                aux %= 10;
                vai1 = 1;
            } else {
                vai1 = 0;
            }
            soma.add(0, aux);
            ai--;
            bi--;
        }
        System.out.printf("Resultado: %s\n", soma);
    }
}
