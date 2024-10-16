package com.github.glaucioscheibel.sequencial;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double tempoGasto, velocidadeMedia;
        Scanner input = new Scanner(System.in);
        System.out.print("Tempo gasto: ");
        tempoGasto = input.nextDouble();
        System.out.print("Velocidade média: ");
        velocidadeMedia = input.nextDouble();
        double distancia = tempoGasto * velocidadeMedia;
        double litrosUsados = distancia / 12;
        System.out.printf("Velocidade média: %.2f \n", velocidadeMedia);
        System.out.printf("Tempo gasto: %.2f \n", tempoGasto);
        System.out.printf("Distância: %.2f \n", distancia);
        System.out.printf("Litros usados: %.2f", litrosUsados);
        input.close();
    }
}
