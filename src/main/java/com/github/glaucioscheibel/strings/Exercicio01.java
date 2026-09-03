package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio01 {
    void main() {
        String nome;
        StringBuilder nomeInvertido = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o seu nome:");
        nome = input.nextLine();
        nome = nome.toUpperCase();
        for (int i = nome.length() - 1; i >= 0; i--) {
            nomeInvertido.append(nome.charAt(i));
        }
        System.out.printf("Seu nome invertido é %s%n", nomeInvertido);
        input.close();
    }
}
