package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        double morango, macas;
        double preco = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantidade de morangos: ");
        morango = input.nextDouble();
        System.out.print("Quantidade de maçãs: ");
        macas = input.nextDouble();
        if (morango > 5) {
            preco += morango * 2.2;
        } else {
            preco += morango * 2.5;
        }
        if (macas > 5) {
            preco += macas * 1.5;
        } else {
            preco += macas * 1.8;
        }
        if (preco > 25) {
            preco -= preco * 0.1;
        }
        System.out.printf("Preço: %1.2f", preco);
        input.close();
    }
}
