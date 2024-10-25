package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int soma = 0;
        int max;
        Scanner input = new Scanner(System.in);
        System.out.print("Soma dos números até qual valor? ");
        max = input.nextInt();
        for (int i = 1; i <= max; i++) {
            soma += i;
        }
        System.out.printf("Soma: %d \n", soma);
        input.close();
    }
}
