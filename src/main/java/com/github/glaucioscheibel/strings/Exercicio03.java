package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio03 {
    void main() {
        String codigo;
        int a;
        int b;
        int c;
        int d;
        int e;
        int digito;
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        do {
            System.out.print("Informe um código de 5 algarismos: ");
            codigo = input.nextLine();
            ok = codigo.length() == 5;
            if (ok) {
                for (char ch : codigo.toCharArray()) {
                    ok = Character.isDigit(ch);
                    if (!ok) {
                        break;
                    }
                }
            }
        } while (!ok);
        a = Character.getNumericValue(codigo.charAt(0));
        b = Character.getNumericValue(codigo.charAt(1));
        c = Character.getNumericValue(codigo.charAt(2));
        d = Character.getNumericValue(codigo.charAt(3));
        e = Character.getNumericValue(codigo.charAt(4));
        digito = (6 * a + 5 * b + 4 * c + 3 * d + 2 * e) % 7;
        System.out.printf("Código com dígito: %s-%d%n", codigo, digito);
        input.close();
    }
}
