package com.github.glaucioscheibel.vetores;

import java.util.ArrayList;
import java.util.List;

public class Exercicio09 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 20, 30, 50};
        int[] B = {6, 7, 8, 9, 10, 25, 35, 55, 65, 200};
        int ai = 0;
        int bi = 0;
        List<Integer> C = new ArrayList<>();
        while (ai < A.length && bi < B.length) {
            if (A[ai] < B[bi]) {
                C.add(A[ai]);
                ai++;
            } else {
                C.add(B[bi]);
                bi++;
            }
        }
        while (ai < A.length) {
            C.add(A[ai]);
            ai++;
        }
        while (bi < B.length) {
            C.add(B[bi]);
            bi++;
        }
        System.out.printf("Mesclado: %s\n", C);
    }
}
