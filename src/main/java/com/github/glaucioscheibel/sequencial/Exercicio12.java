package com.github.glaucioscheibel.sequencial;

public class Exercicio12 {
    static void main() {
        int a = 10;
        int b = 20;
        int aux;

        aux = a;
        a = b;
        b = aux;

        System.out.printf("A:%d, B:%d %n", a, b);
    }
}
