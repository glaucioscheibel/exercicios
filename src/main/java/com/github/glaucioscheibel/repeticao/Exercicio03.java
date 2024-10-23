package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int base, expoente;
        int potencia = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        base = input.nextInt();
        System.out.print("Expoente: ");
        expoente = input.nextInt();
        for (int i = 0; i < expoente; i++) {
            potencia *= base;
        }
        System.out.printf("Resultado: %d\n", potencia);
        input.close();
    }
}
