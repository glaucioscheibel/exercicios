package com.github.glaucioscheibel.funcoes.recursao;

import java.util.Scanner;

public class Exercicio05 {
    public static String inverte(String palavra, int pos) {
        if (pos == 0) {
            return "" + palavra.charAt(pos);
        }
        return palavra.charAt(pos) + inverte(palavra, pos - 1);
    }

    public static String inverte(String palavra) {
        return inverte(palavra, palavra.length() - 1);
    }

    public static void main(String[] args) {
        String palavra;
        Scanner input = new Scanner(System.in);
        System.out.print("Palavra: ");
        palavra = input.nextLine();
        System.out.printf("O inverso de %s é %s\n", palavra, inverte(palavra));
        input.close();
    }
}
