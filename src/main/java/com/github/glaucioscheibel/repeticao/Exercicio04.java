package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int tabuadas;
        Scanner input = new Scanner(System.in);
        System.out.print("Tabuadas até ");
        tabuadas = input.nextInt();
        for (int tabuada = 1; tabuada <= tabuadas; tabuada++) {
            System.out.printf("Tabuada de %d\n", tabuada);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%2d x %2d = %2d \n", tabuada, i, (tabuada * i));
            }
            System.out.println();
        }
        input.close();
    }
}
