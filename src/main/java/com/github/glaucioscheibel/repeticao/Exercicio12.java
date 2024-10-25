package com.github.glaucioscheibel.repeticao;

public class Exercicio12 {
    public static void main(String[] args) {
        int paisA = 80_000;
        int paisB = 200_000;
        int anos = 0;
        while (paisA < paisB) {
            anos += 1;
            paisA += paisA * 0.03;
            paisB += paisB * 0.015;
        }
        System.out.printf("O país A leva %d anos para ultrapassar o país B.\n", anos);
    }
}
