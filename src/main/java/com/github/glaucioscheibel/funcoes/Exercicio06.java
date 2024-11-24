package com.github.glaucioscheibel.funcoes;

import java.util.Scanner;

public class Exercicio06 {
    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número: ");
        int numero = input.nextInt();
        System.out.printf("O número %d %sé primo\n", numero, ehPrimo(numero) ? "" : "não ");
        input.close();
    }
}
