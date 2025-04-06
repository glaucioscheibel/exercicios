package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int numero;
        boolean primo = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Número: ");
        numero = input.nextInt();
        for (int i = 2; i < (numero / 2) + 1; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.printf("O número %d %sé primo\n", numero, primo ? "" : "não ");
        input.close();
    }
}
