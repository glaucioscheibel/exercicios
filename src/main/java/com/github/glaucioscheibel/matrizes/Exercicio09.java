package com.github.glaucioscheibel.matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int[][] dist = {
            {0, 2, 11, 6, 15, 11, 1},
            {2, 0, 7, 12, 4, 2, 15},
            {11, 7, 0, 11, 8, 3, 13},
            {6, 12, 11, 0, 10, 2, 1},
            {15, 4, 8, 10, 0, 5, 13},
            {11, 2, 3, 2, 5, 0, 14},
            {1, 15, 13, 1, 13, 14, 0}
        };
        int origem, destino;
        Scanner input = new Scanner(System.in);
        System.out.print("Cidade origem(1-7): ");
        origem = input.nextInt();
        System.out.print("Cidade destino(1-7): ");
        destino = input.nextInt();
        System.out.printf(
                "Tempo da cidade de %d para %d é de %d horas\n", origem, destino, dist[origem - 1][destino - 1]);

        System.out.println("Informe as cidades da rota. 0 finaliza.");
        List<Integer> cidades = new ArrayList<>();
        int aux = -1;
        while (aux != 0) {
            System.out.print("Cidade: ");
            aux = input.nextInt();
            if (aux != 0) {
                cidades.add(aux);
            }
        }
        int tempo = 0;
        for (int i = 0; i < cidades.size() - 1; i++) {
            tempo += dist[cidades.get(i) - 1][cidades.get(i + 1) - 1];
        }
        System.out.printf("Rota %s é de %d horas ", cidades, tempo);
        input.close();
    }
}
