package com.github.glaucioscheibel.vetores;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Numero %d: ", i);
            numeros[i] = input.nextInt();
        }
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int media = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                maior = numeros[i];
                menor = numeros[i];
            } else {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }
            soma += numeros[i];
        }
        media = soma / numeros.length;
        System.out.printf("Soma: %d\n", soma);
        System.out.printf("Média: %d\n", media);
        System.out.printf("Maior: %d\n", maior);
        System.out.printf("Menor: %d\n", menor);
        input.close();
    }
}
