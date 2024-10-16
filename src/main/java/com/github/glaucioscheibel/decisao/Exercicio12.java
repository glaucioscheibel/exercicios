package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        char tipo;
        double litros;
        double preco = 0;
        final double alcool = 2.9;
        final double gasolina = 3.3;
        Scanner input = new Scanner(System.in);
        System.out.print("A-álcool, G-gasolina: ");
        tipo = input.nextLine().toUpperCase().charAt(0);
        System.out.print("Litros: ");
        litros = input.nextDouble();
        if (tipo == 'A') {
            preco = litros * (alcool - (alcool * litros <= 20 ? alcool * 0.03 : alcool * 0.05));
        } else if (tipo == 'G') {
            preco = litros * (gasolina - (gasolina * litros <= 20 ? gasolina * 0.04 : gasolina * 0.06));
        } else {
            System.out.println("Tipo desconhecido");
        }
        if (preco > 0) {
            System.out.printf("Preço: R$ %1.2f \n", preco);
        }
    }
}
