package com.github.glaucioscheibel.matrizes;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) {
        int[][] a = {{-10, 1, 4, 6}, {2, 3, 2, 8}};
        int[][] b = {{1, 8, 4, -1}, {0, 6, 3, -3}};
        List<List<Integer>> c = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            c.add(new ArrayList<>());
            for (int j = 0; j < a[i].length; j++) {
                c.get(i).add(a[i][j] + b[i][j]);
            }
        }
        System.out.printf("C: %s\n", c);
    }
}
