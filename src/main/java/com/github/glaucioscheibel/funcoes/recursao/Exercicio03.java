package com.github.glaucioscheibel.funcoes.recursao;

import java.util.Scanner;

public class Exercicio03 {
    public static int mdc(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return mdc(y, x % y);
        }
    }

    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("X: ");
        x = input.nextInt();
        System.out.print("Y: ");
        y = input.nextInt();
        System.out.printf("O máximo divisor comum de %d e %d é %d\n", x, y, mdc(x, y));
        input.close();
    }
}
