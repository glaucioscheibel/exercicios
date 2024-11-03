package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        String nome;
        String iniciais = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o nome completo: ");
        nome = input.nextLine();
        String[] palavras = nome.split(" ");
        for (String palavra : palavras) {
            if (!palavra.equals("do")
                    && !palavra.equals("dos")
                    && !palavra.equals("da")
                    && !palavra.equals("das")
                    && !palavra.equals("de")
                    && !palavra.equals("di")
                    && !palavra.equals("du")
                    && !palavra.equals("e")) {
                iniciais += palavra.charAt(0);
            }
        }
        System.out.printf("Iniciais: %s\n", iniciais);
        input.close();
    }
}
