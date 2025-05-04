package com.github.glaucioscheibel.funcoes;

public class Exercicio03 {
    public static int soma(int... a) {
        int resultado = 0;
        for (int i : a) {
            resultado += i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.printf("soma de %d, %d, %d e %d é %d\n", a, b, c, d, soma(a, b, c, d));
    }
}
