package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio08 {
    void main() {
        String palavra;
        StringBuilder resultado = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        palavra = input.nextLine();
        for (char c : palavra.toCharArray()) {
            if (Character.isUpperCase(c)) {
                resultado.append(Character.toLowerCase(c));
            } else {
                resultado.append(Character.toUpperCase(c));
            }
        }
        System.out.printf("Resultado: %s%n", resultado);
        input.close();
    }
}
