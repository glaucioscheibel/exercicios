package com.github.glaucioscheibel.funcoes;

public class Exercicio02 {
    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.printf("soma de %d, %d e %d é %d\n", a, b, c, soma(a, b, c));
    }
}
