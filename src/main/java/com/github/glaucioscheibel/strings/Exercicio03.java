package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        String codigo;
        int A, B, C, D, E, digito;
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        do {
            System.out.print("Informe um código de 5 algarismos: ");
            codigo = input.nextLine();
            ok = codigo.length() == 5;
            if (ok) {
                for (char c : codigo.toCharArray()) {
                    ok = Character.isDigit(c);
                    if (!ok) {
                        break;
                    }
                }
            }
        } while (!ok);
        A = Character.getNumericValue(codigo.charAt(0));
        B = Character.getNumericValue(codigo.charAt(1));
        C = Character.getNumericValue(codigo.charAt(2));
        D = Character.getNumericValue(codigo.charAt(3));
        E = Character.getNumericValue(codigo.charAt(4));
        digito = (6 * A + 5 * B + 4 * C + 3 * D + 2 * E) % 7;
        System.out.printf("Código com dígito: %s-%d\n", codigo, digito);
        input.close();
    }
}
