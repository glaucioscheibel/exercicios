package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int n = -1;
        int min = 0;
        int max = 0;
        int pares = 0;
        int impares = 0;
        int total = 0;
        int qtde = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Número: ");
            n = input.nextInt();
            if (n != 0) {
                if (qtde == 0) {
                    min = n;
                    max = n;
                } else {
                    if (n < min) {
                        min = n;
                    }
                    if (n > max) {
                        max = n;
                    }
                }
                if (n % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                qtde++;
                total += n;
            }
        } while (n != 0);
        System.out.printf("Maior: %d\n", max);
        System.out.printf("Menor: %d\n", min);
        System.out.printf("Soma: %d\n", total);
        System.out.printf("Média: %1.2f\n", ((double) total / qtde));
        System.out.printf("Pares: %d\n", pares);
        System.out.printf("Impares: %d\n", impares);
        input.close();
    }
}
