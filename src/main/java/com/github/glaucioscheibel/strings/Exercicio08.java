package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        String palavra;
        String resultado = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        palavra = input.nextLine();
        for (char c : palavra.toCharArray()) {
            if (Character.isUpperCase(c)) {
                resultado += Character.toLowerCase(c);
            } else {
                resultado += Character.toUpperCase(c);
            }
        }
        System.out.printf("Resultado: %s\n", resultado);
        input.close();
    }
}
