package com.github.glaucioscheibel.repeticao;

public class Exercicio01 {
    public static void main(String[] args) {
        int i = 0;
        int soma = 0;
        while (i <= 100) {
            soma += i;
            i += 1;
        }
        System.out.printf("Soma: %d \n", soma);
    }
}
