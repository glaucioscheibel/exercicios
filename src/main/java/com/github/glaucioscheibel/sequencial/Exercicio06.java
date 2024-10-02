package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        String nome, sobrenome, nomeCompleto;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        nome = input.next();
        System.out.print("Informe o sobrenome: ");
        sobrenome = input.next();
        nomeCompleto = nome + " " + sobrenome;
        System.out.printf("Seu nome completo é %s\n", nomeCompleto);
    }
}
