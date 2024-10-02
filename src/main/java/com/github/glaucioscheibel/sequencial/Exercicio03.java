package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        float n1, n2, n3, media;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a nota1: ");
        n1 = input.nextFloat();
        System.out.print("Informe a nota2: ");
        n2 = input.nextFloat();
        System.out.print("Informe a nota3: ");
        n3 = input.nextFloat();
        media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
        System.out.printf("Media: %2.2f \n", media);
    }
}
