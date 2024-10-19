package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int i = 0;
        int soma = 0;
        int max;
        Scanner input = new Scanner(System.in);
        System.out.print("Soma dos números até qual valor? ");
        max = input.nextInt();
        while (i <= max) {
            soma += i;
            i += 1;
        }
        System.out.printf("Soma: %d \n", soma);
        input.close();
    }
}
