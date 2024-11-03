package com.github.glaucioscheibel.repeticao;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pense em um número entre 1 e 1000, e tecle enter.");
        input.nextLine();
        int min = 1;
        int max = 1000;
        boolean acertei = false;
        char resp;
        while (!acertei) {
            int chute = (min + max) / 2;
            System.out.printf("O número que você pensou é %d?\n", chute);
            System.out.print("S-im, M-aior, N-menor: ");
            resp = input.nextLine().toUpperCase().charAt(0);
            if (resp == 'S') {
                acertei = true;
            } else if (resp == 'M') {
                min = chute + 1;
            } else if (resp == 'N') {
                max = chute - 1;
            } else {
                System.out.println("Resposta inválida.");
            }
        }
        System.out.println("Acertei!!!");
        input.close();
    }
}
