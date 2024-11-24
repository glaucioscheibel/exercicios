package com.github.glaucioscheibel.funcoes.recursao;

import java.util.Scanner;

public class Exercicio02 {
    public static int fatorial(int numero) {
        if (numero <= 1) {
            return 1;
        }
        return numero * fatorial(numero - 1);
    }

    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.print("Número: ");
        numero = input.nextInt();
        System.out.printf("Fatorial: %d\n", fatorial(numero));
        input.close();
    }
}
