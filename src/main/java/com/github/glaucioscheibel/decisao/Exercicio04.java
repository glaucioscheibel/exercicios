package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double valor, salario, valorParcela;
        int parcelas;
        Scanner input = new Scanner(System.in);
        System.out.print("Valor do empréstimo: ");
        valor = input.nextDouble();
        System.out.print("Quantidade de parcelas: ");
        parcelas = input.nextInt();
        System.out.print("Salário: ");
        salario = input.nextDouble();
        valorParcela = valor / parcelas;
        if (valorParcela >= salario * 0.3) {
            System.out.println("Empréstimo não aprovado.");
        } else {
            System.out.println("Empréstimo aprovado.");
        }
    }
}
