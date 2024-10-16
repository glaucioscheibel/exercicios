package com.github.glaucioscheibel.decisao.condicional;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int val1, val2;
        int resultado = 0;
        char operacao;
        Scanner input = new Scanner(System.in);
        System.out.print("Valor1: ");
        val1 = input.nextInt();
        System.out.print("Valor2: ");
        val2 = input.nextInt();
        input.nextLine(); // ignore o \n
        System.out.print("Operação: ");
        operacao = input.nextLine().charAt(0);
        switch (operacao) {
            case '+':
                resultado = val1 + val2;
                break;
            case '-':
                resultado = val1 - val2;
                break;
            case '*':
                resultado = val1 * val2;
                break;
            case '/':
                resultado = val1 / val2;
                break;
        }
        System.out.printf("%d %s %d = %d", val1, operacao, val2, resultado);
        input.close();
    }
}
