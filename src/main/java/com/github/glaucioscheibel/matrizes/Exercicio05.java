package com.github.glaucioscheibel.matrizes;

import java.util.ArrayList;
import java.util.List;

public class Exercicio05 {
    public static void main(String[] args) {
        int[][] a = {{-7, 8}, {4, 9}, {2, 1}};
        List<List<Integer>> at = new ArrayList<>();
        for (int j = 0; j < a[0].length; j++) {
            at.add(new ArrayList<>());
            for (int i = 0; i < a.length; i++) {
                at.get(j).add(a[i][j]);
            }
        }
        System.out.printf("at: %s\n", at);
    }
}
