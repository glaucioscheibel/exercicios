package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double c, f;
        Scanner input = new Scanner(System.in);
        System.out.print("Temperatura em celsius: ");
        c = input.nextDouble();
        f = (c * 9 / 5) + 32;
        System.out.printf("Temperatura em fahrenheit: %.2f", f);
    }
}
