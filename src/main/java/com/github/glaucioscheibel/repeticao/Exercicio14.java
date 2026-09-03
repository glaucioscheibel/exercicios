package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio14 {
    void main() {
        int n;
        long fatorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Número: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.printf("%d! = %d%n", n, fatorial);
        input.close();
    }
}
