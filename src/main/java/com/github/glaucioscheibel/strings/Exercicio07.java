package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        String palavra1, palavra2;
        Scanner input = new Scanner(System.in);
        System.out.print("Palavra 1: ");
        palavra1 = input.nextLine();
        System.out.print("Palavra 2: ");
        palavra2 = input.nextLine();
        boolean anagrama = palavra1.length() == palavra2.length();
        if (anagrama) {
            String aux = palavra2;
            for (char c : palavra1.toCharArray()) {
                aux = aux.replaceFirst(String.valueOf(c), "");
            }
            anagrama = aux.isEmpty();
        }
        System.out.printf("%s e %s%s são anagramas\n", palavra1, palavra2, anagrama ? "" : " não");
        input.close();
    }
}
