package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        double potencia, largura, comprimento;
        int quantidade;
        Scanner input = new Scanner(System.in);
        System.out.print("Potencia da lâmpada: ");
        potencia = input.nextDouble();
        System.out.print("Largura do cômodo: ");
        largura = input.nextDouble();
        System.out.print("Comprimento do cômodo: ");
        comprimento = input.nextDouble();
        quantidade = (int) Math.ceil(largura * comprimento * 18 / potencia);
        System.out.printf("São necessárias %d lâmpadas.\n", quantidade);
        input.close();
    }
}
