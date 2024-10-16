package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int a, b, c;
        double delta;
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        a = input.nextInt();
        System.out.print("B: ");
        b = input.nextInt();
        System.out.print("C: ");
        c = input.nextInt();
        if (a != 0) {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta > 0) {
                if (delta == 0) {
                    System.out.println("A equação possui apenas uma raiz real");
                } else {
                    System.out.println("A equação possui duas raízes reais");
                }
            } else {
                System.out.println("A equação não possui raízes reais");
            }
        } else {
            System.out.println("A equação não é do segundo grau");
        }
    }
}
