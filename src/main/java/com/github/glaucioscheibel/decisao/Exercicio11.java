package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int ano;
        boolean bissexto;
        Scanner input = new Scanner(System.in);
        System.out.print("Ano: ");
        ano = input.nextInt();
        bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
        System.out.printf("O ano %d%sé bissexto\n", ano, bissexto ? " " : " não ");
        input.close();
    }
}
