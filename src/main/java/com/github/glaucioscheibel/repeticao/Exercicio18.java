package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio18 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        int brancos = 0;
        int nulos = 0;
        int voto = 0;
        while (voto != -1) {
            voto = input.nextInt();
            switch (voto) {
                case 1 -> cont1 += 1;
                case 2 -> cont2 += 1;
                case 0 -> brancos += 1;
                default -> nulos += 1;
            }
        }
        System.out.println(cont1);
        System.out.println(cont2);
        System.out.println(brancos);
        System.out.println(nulos);
        input.close();
    }
}
