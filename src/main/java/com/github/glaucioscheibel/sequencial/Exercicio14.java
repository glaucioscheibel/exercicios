package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        double bruto, previdencia, ir, liquido;
        Scanner input = new Scanner(System.in);
        System.out.print("Salário bruto: ");
        bruto = input.nextDouble();
        previdencia = bruto * 0.1;
        ir = (bruto - previdencia) * 0.05;
        liquido = bruto - previdencia - ir;
        System.out.printf("  Salário Bruto: R$ %1.2f\n", bruto);
        System.out.printf("    Previdência: R$ %1.2f\n", previdencia);
        System.out.printf("           I.R.: R$ %1.2f\n", ir);
        System.out.printf("Salário Líquido: R$ %1.2f\n", liquido);
        input.close();
    }
}
