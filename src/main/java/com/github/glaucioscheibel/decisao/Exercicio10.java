package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int a, b, c;
        double delta;
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        a = input.nextInt();
        if (a == 0) {
            System.out.println("A equação não é do segundo grau");
        } else {
            System.out.print("B: ");
            b = input.nextInt();
            System.out.print("C: ");
            c = input.nextInt();
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais");
            } else {
                double r1 = (-b + Math.sqrt(delta)) / (2 * a);
                if (delta == 0) {
                    System.out.printf("A equação possui apenas uma raiz real: %1.2f\n", r1);
                } else {
                    double r2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("A equação possui duas raízes reais: %1.2f e %1.2f", r1, r2);
                }
            }
        }
        input.close();
    }
}
