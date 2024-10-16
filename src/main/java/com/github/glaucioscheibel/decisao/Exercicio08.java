package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int ladoA, ladoB, ladoC;
        String msg = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Lado A: ");
        ladoA = input.nextInt();
        System.out.print("Lado B: ");
        ladoB = input.nextInt();
        System.out.print("Lado C: ");
        ladoC = input.nextInt();
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            if (ladoA == ladoB && ladoB == ladoC) {
                msg = "Triângulo equilátero";
            } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                msg = "Triângulo isósceles";
            } else {
                msg = "Triângulo escaleno";
            }
        } else {
            msg = "Os lados não formam um triângulo";
        }
        System.out.println(msg);
    }
}
