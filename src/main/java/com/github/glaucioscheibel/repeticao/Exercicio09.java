package com.github.glaucioscheibel.repeticao;

public class Exercicio09 {
    static void main() {
        int a = 37;
        int b = 38;
        int c = 1;
        double soma = 0;
        while (c <= 37) {
            soma += a-- * b-- / (double) c++;
        }
        System.out.printf("Resultado: %1.2f", soma);
    }
}
