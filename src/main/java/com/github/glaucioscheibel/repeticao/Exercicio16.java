package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        int n, aux;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci até qual número? ");
        n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.printf("%d, %d", a, b);
        do {
            aux = b + a;
            a = b;
            b = aux;
            System.out.printf(", %d", b);
        } while (b < n);
        System.out.println();
        input.close();
    }
}
