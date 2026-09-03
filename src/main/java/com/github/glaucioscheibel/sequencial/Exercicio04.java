package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio04 {

    void main() {
        double raio;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        raio = input.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Area: %.2f %n", area);
        input.close();
    }
}
