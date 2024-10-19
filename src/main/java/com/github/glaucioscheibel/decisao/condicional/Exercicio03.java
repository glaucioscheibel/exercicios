package com.github.glaucioscheibel.decisao.condicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double valor, valorAPagar;
        int tipo;
        Scanner input = new Scanner(System.in);
        System.out.print("Valor da compra: ");
        valor = input.nextDouble();
        System.out.print("Tipo de pessoa: ");
        tipo = input.nextInt();
        switch (tipo) {
            case 1:
                valorAPagar = valor;
                break;
            case 2:
                valorAPagar = valor - valor * 0.1;
                break;
            case 3:
                valorAPagar = valor - valor * 0.05;
                break;
            default:
                valorAPagar = 0;
                break;
        }
        System.out.printf("Valor a pagar: %1.2f \n", valorAPagar);
        input.close();
    }
}
