package com.github.glaucioscheibel.repeticao;

public class Exercicio10 {
    public static void main(String[] args) {
        double anacleto = 1.5;
        double felisberto = 1.1;
        int anos = 0;
        while (felisberto <= anacleto) {
            anacleto += 0.02;
            felisberto += 0.03;
            anos += 1;
        }
        System.out.printf("Felisberto será maior que Anacleto em %d anos\n", anos);
    }
}
