package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String frase, leet;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um frase: ");
        frase = input.nextLine();
        leet = frase.toUpperCase();
        leet = leet.replaceAll("D", "|)");
        leet = leet.replaceAll("I", "1");
        leet = leet.replaceAll("O", "0");
        leet = leet.replaceAll("A", "4");
        leet = leet.replaceAll("E", "3");
        leet = leet.replaceAll("B", "ß");
        System.out.printf("L33t: %s\n", leet);
        input.close();
    }
}
