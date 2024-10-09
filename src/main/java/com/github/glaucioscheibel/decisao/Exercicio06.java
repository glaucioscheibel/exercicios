package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        float n1, n2, n3, n4, media, exame;
        boolean aprovado = false;
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
        if (media >= 7) {
            aprovado = true;
        } else {
            System.out.printf("Media: %2.2f \n", media);
            System.out.print("Nota do exame: ");
            exame = input.nextFloat();
            media = (media + exame) / 2;
            if (media >= 5) {
                aprovado = true;
            }
        }
        System.out.printf("Media final: %2.2f \n", media);
        if (aprovado) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
