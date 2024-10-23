package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double saldo;
        Scanner input = new Scanner(System.in);
        System.out.print("Valor depositado: ");
        saldo = input.nextDouble();
        for (int mes = 1; mes <= 12; mes++) {
            saldo += saldo * 0.005;
            System.out.printf("Mês %2d saldo: %1.2f \n", mes, saldo);
        }
        input.close();
    }
}
