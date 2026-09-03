package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio11 {
    static void main() {
        double massa;
        int tempo = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Massa inicial: ");
        massa = input.nextDouble();
        while (massa >= 0.05) {
            tempo += 50;
            massa /= 2;
        }
        System.out.printf("Levou %d segundos.%n", tempo);
        input.close();
    }
}
