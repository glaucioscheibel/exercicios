package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double base, expoente, resultado;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe base: ");
        base = input.nextInt();
        System.out.print("Informe expoente: ");
        expoente = input.nextInt();
        resultado = Math.pow(base, expoente);
        System.out.printf("Resultado: %.0f \n", resultado);
    }
}
