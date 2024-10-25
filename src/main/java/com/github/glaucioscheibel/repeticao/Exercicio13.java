package com.github.glaucioscheibel.repeticao;

import java.math.BigInteger;

public class Exercicio13 {
    public static void main(String[] args) {
        BigInteger graos = BigInteger.ONE;
        BigInteger total = BigInteger.ZERO;
        for (int casa = 1; casa <= 64; casa++) {
            total = total.add(graos);
            graos = graos.multiply(BigInteger.TWO);
        }
        System.out.printf("Total de grãos: %s\n", total);

        // Versao alternativa:
        BigInteger total2 = BigInteger.TWO.pow(64).subtract(BigInteger.ONE);
        System.out.printf("Total de grãos: %s\n", total2);
    }
}
