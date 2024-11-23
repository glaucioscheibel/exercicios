package com.github.glaucioscheibel.funcoes;

import java.util.Scanner;

public class Exercicio01 {
    public static boolean ehPrefixo(String palavra, String prefixo) {
        return palavra.startsWith(prefixo);
    }

    public static void main(String[] args) {
        String palavra;
        String prefixo;
        Scanner input = new Scanner(System.in);
        System.out.print("Palavra: ");
        palavra = input.nextLine();
        System.out.print("Prefixo: ");
        prefixo = input.nextLine();
        System.out.printf("%s%s é prefixo de %s", prefixo, ehPrefixo(palavra, prefixo) ? "" : " não", palavra);
        input.close();
    }
}
