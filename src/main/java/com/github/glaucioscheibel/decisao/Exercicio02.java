package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.print("Número 1: ");
        num1 = input.nextInt();
        System.out.print("Número 2: ");
        num2 = input.nextInt();
        System.out.print("Número 3: ");
        num3 = input.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.printf("Maior: %d \n", num1);
            } else {
                System.out.printf("Maior: %d \n", num3);
            }
        } else {
            if (num2 > num3) {
                System.out.printf("Maior: %d \n", num2);
            } else {
                System.out.printf("Maior: %d \n", num3);
            }
        }
    }
}
