package com.github.glaucioscheibel.funcoes.recursao;

import java.util.Scanner;

public class Exercicio01 {
    public static int soma(int numero) {
        if (numero <= 1) {
            return numero;
        }
        return numero + soma(numero - 1);
    }

    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.print("Número: ");
        numero = input.nextInt();
        System.out.printf("Somatória: %d\n", soma(numero));
        input.close();
    }
}
