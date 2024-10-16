package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        final double salarioMinimo = 1412.0;
        double salario;
        Scanner input = new Scanner(System.in);
        System.out.print("Salário atual: ");
        salario = input.nextDouble();
        if (salario < salarioMinimo * 3) {
            salario *= 1.5;
        } else if (salario < salarioMinimo * 10) {
            salario *= 1.2;
        } else if (salario < salario * 20) {
            salario *= 1.15;
        } else {
            salario *= 1.1;
        }
        System.out.printf("Novo salário: R$ %1.2f \n", salario);
    }
}
