package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double horasTrabalhadas, salarioHora, salarioTotal;
        double horasExtras = 0.0;
        double horasNormais = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Salário-hora: ");
        salarioHora = input.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = input.nextDouble();
        if (horasTrabalhadas > 40) {
            horasExtras = horasTrabalhadas - 40;
            horasNormais = 40;
        } else {
            horasNormais = horasTrabalhadas;
        }
        salarioTotal = horasNormais * salarioHora + horasExtras * salarioHora * 1.5;
        System.out.printf("Salário total: %1.2f \n", salarioTotal);
    }
}
