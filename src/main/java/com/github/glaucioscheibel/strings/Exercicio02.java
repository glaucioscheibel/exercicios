package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        String frase;
        int vogais = 0;
        int espacos = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe uma frase: ");
        frase = input.nextLine();
        frase = frase.toLowerCase();
        for (char c : frase.toCharArray()) {
            switch (c) {
                case ' ':
                    espacos++;
                    break;
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vogais++;
                    break;
            }
        }
        System.out.printf("Na frase tem %d espaços e %d vogais.\n", espacos, vogais);
        input.close();
    }
}
