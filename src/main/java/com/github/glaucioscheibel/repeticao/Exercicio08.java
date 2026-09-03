package com.github.glaucioscheibel.repeticao;

public class Exercicio08 {
    void main() {
        double a = 1000;
        int b = 1;
        double soma = 0;
        while (b <= 50) {
            if (b % 2 == 0) {
                soma -= a / b;
            } else {
                soma += a / b;
            }
            a -= 3;
            b++;
        }
        System.out.printf("Soma: %1.2f%n", soma);
    }
}
