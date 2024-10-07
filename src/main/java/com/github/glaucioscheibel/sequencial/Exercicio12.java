package com.github.glaucioscheibel.sequencial;

public class Exercicio12 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int aux;

        aux = A;
        A = B;
        B = aux;

        System.out.printf("A:%d, B:%d \n", A, B);
    }
}
