package com.github.glaucioscheibel.matrizes;

import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {
    public static void main(String[] args) {
        int[][] a = {{2, -3}, {-1, 4}};
        List<List<Integer>> at = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            at.add(new ArrayList<>());
            for (int j = 0; j < a[i].length; j++) {
                at.get(i).add(a[i][j] * -1);
            }
        }
        System.out.printf("At: %s\n", at);
    }
}
