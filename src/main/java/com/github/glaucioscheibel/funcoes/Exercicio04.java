package com.github.glaucioscheibel.funcoes;

import java.util.Scanner;

public class Exercicio04 {
    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }

    public static void main(String[] args) {
        int ano;
        Scanner input = new Scanner(System.in);
        System.out.print("Ano: ");
        ano = input.nextInt();
        System.out.printf("O ano %d%sé bissexto\n", ano, ehBissexto(ano) ? " " : " não ");
        input.close();
    }
}
