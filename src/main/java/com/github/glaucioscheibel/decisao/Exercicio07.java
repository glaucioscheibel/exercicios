package com.github.glaucioscheibel.decisao;

import java.util.Scanner;

public class Exercicio07 {
    void main() {
        double horasTrabalhadas;
        double salarioHora;
        double salarioTotal;
        double horasExtras = 0.0;
        double horasNormais;
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
        System.out.printf("Salário total: %1.2f %n", salarioTotal);
        input.close();
    }
}
