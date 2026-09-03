package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio05 {
    void main() {
        int a;
        int b;
        double soma = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        a = input.nextInt();
        System.out.print("B: ");
        b = input.nextInt();
        for (int i = a; i <= b; i++) {
            soma += Math.pow(i, 3);
        }
        System.out.printf("Resultado: %2.0f%n", soma);
        input.close();
    }
}
