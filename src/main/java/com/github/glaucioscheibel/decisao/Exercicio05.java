package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String nome;
        double vendas, comissao;
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do corretor: ");
        nome = input.nextLine();
        System.out.print("Valor das vendas: ");
        vendas = input.nextDouble();
        if (vendas > 50_000) {
            comissao = vendas * 0.12;
        } else if (vendas >= 30_000) {
            comissao = vendas * 0.095;
        } else {
            comissao = vendas * 0.07;
        }
        System.out.printf("%s receberá R$ %,1.2f de comissão\n", nome, comissao);
        input.close();
    }
}
