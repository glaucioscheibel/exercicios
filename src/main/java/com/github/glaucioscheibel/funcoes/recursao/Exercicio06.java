package com.github.glaucioscheibel.funcoes.recursao;

import java.util.Scanner;

public class Exercicio06 {
    public static void hanoi(int quantidade, String origem, String destino, String aux) {
        if (quantidade >= 1) {
            hanoi(quantidade - 1, origem, aux, destino);
            System.out.printf("Movendo disco de %s para %s\n", origem, destino);
            hanoi(quantidade - 1, aux, destino, origem);
        }
    }

    public static void main(String[] args) {
        int quantidade;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade de discos: ");
        quantidade = input.nextInt();
        hanoi(quantidade, "A", "B", "C");
        input.close();
    }
}
