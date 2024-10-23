package com.github.glaucioscheibel.repeticao;

public class Exercicio08 {
    public static void main(String[] args) {
        double a = 1000;
        double b = 1;
        double soma = 0;
        while (b <= 50) {
            if (b % 2 == 0) {
                soma -= a / b;
            } else {
                soma += a / b;
            }
            a -= 3;
            b += 1;
        }
        System.out.printf("Soma: %1.2f\n", soma);
    }
}
