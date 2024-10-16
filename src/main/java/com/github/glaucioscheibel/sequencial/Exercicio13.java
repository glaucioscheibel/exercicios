package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        double area, preco;
        int latas;
        Scanner input = new Scanner(System.in);
        System.out.print("Área em m²: ");
        area = input.nextDouble();
        latas = (int) Math.ceil(area / 3 / 18);
        preco = latas * 80;
        System.out.printf("São necessárias %d latas. Total: R$%1.2f \n", latas, preco);
        input.close();
    }
}
