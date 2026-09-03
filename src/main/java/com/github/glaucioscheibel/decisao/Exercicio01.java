package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio01 {

    void main() {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Número 1: ");
        num1 = input.nextInt();
        System.out.print("Número 2: ");
        num2 = input.nextInt();
        if (num1 > num2) {
            System.out.printf("Maior: %d %n", num1);
        } else {
            System.out.printf("Maior: %d %n", num2);
        }
        input.close();
    }
}
