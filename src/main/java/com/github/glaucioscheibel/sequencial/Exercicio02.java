package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        float n1, n2, n3, n4, media;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a nota1: ");
        n1 = input.nextFloat();
        System.out.print("Informe a nota2: ");
        n2 = input.nextFloat();
        System.out.print("Informe a nota3: ");
        n3 = input.nextFloat();
        System.out.print("Informe a nota4: ");
        n4 = input.nextFloat();
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("Media: %2.2f \n", media);
        input.close();
    }
}
