package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio05 {
    static void main() {
        String frase;
        String leet;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um frase: ");
        frase = input.nextLine();
        leet = frase.toUpperCase();
        leet = leet.replace("D", "|)");
        leet = leet.replace("I", "1");
        leet = leet.replace("O", "0");
        leet = leet.replace("A", "4");
        leet = leet.replace("E", "3");
        leet = leet.replace("B", "ß");
        System.out.printf("L33t: %s%n", leet);
        input.close();
    }
}
