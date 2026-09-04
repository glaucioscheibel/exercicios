package com.github.glaucioscheibel.decisao.condicional;

import java.util.Scanner;

public class Exercicio03 {
    static void main() {
        double valor;
        double valorAPagar;
        int tipo;
        Scanner input = new Scanner(System.in);
        System.out.print("Valor da compra: ");
        valor = input.nextDouble();
        System.out.print("Tipo de pessoa: ");
        tipo = input.nextInt();
        valorAPagar = switch (tipo) {
            case 1 -> valor;
            case 2 -> valor - valor * 0.1;
            case 3 -> valor - valor * 0.05;
            default -> 0;
        };
        System.out.printf("Valor a pagar: %1.2f %n", valorAPagar);
        input.close();
    }
}
