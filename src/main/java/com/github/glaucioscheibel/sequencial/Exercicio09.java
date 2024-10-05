package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        double comprimento, largura, altura, volume;
        Scanner input = new Scanner(System.in);
        System.out.print("Comprimento: ");
        comprimento = input.nextDouble();
        System.out.print("Largura: ");
        largura = input.nextDouble();
        System.out.print("Altura: ");
        altura = input.nextDouble();
        volume = comprimento * largura * altura;
        System.out.printf("Volume: %.2f \n", volume);
    }
}
