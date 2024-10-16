package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int qtdeMacas;
        double valor;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantidade de maçãs: ");
        qtdeMacas = input.nextInt();
        if (qtdeMacas < 12) {
            valor = qtdeMacas * 1.3;
        } else {
            valor = qtdeMacas * 1.1;
        }
        System.out.printf("Total: R$ %1.2f \n", valor);
        input.close();
    }
}
