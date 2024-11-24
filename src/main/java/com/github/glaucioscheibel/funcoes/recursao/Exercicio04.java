package com.github.glaucioscheibel.funcoes.recursao;

import java.util.Scanner;

public class Exercicio04 {
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O n deve ser positivo");
        }
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        n = input.nextInt();
        System.out.printf("O número na posição %d é %d\n", n, fibonacci(n));
        input.close();
    }
}
