package com.github.glaucioscheibel.repeticao;

public class Exercicio09 {
    public static void main(String[] args) {
        double a = 37;
        double b = 38;
        double c = 1;
        double soma = 0;
        while (c <= 37) {
            soma += a * b / c;
            a -= 1;
            b -= 1;
            c += 1;
        }
        System.out.printf("Resultado: %1.2f", soma);
    }
}
