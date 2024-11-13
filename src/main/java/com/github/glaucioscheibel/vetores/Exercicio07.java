package com.github.glaucioscheibel.vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        List<Integer> matriculas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int aux = 0;
        while (matriculas.size() < 100) {
            System.out.printf("Matrícula: %d: ", matriculas.size());
            aux = input.nextInt();
            if (matriculas.contains(aux)) {
                System.err.printf("A matrícula %d já existe!\n", aux);
            } else {
                matriculas.add(aux);
            }
        }
        System.out.printf("Matrículas: %s\n", matriculas);
        input.close();
    }
}
