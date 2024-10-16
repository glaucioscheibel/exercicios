package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int anos, meses, dias;
        Scanner input = new Scanner(System.in);
        System.out.print("Anos: ");
        anos = input.nextInt();
        System.out.print("Meses: ");
        meses = input.nextInt();
        System.out.print("Dias: ");
        dias = input.nextInt();
        dias += anos * 365 + meses * 30;
        System.out.printf("Você ja viveu %d dias", dias);
        input.close();
    }
}
