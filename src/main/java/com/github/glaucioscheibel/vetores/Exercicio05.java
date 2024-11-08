package com.github.glaucioscheibel.vetores;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class Exercicio05 {
    public static void main(String[] args) {
        List<Integer> a = List.of(2, 4, 7, 13, 14, 15, 16);
        List<Integer> b = List.of(1, 6, 7, 11, 13, 16, 18);

        Collection<Integer> uniao = new LinkedHashSet<>();
        uniao.addAll(a);
        uniao.addAll(b);

        Collection<Integer> interseccao = new LinkedHashSet<>();
        for (int n : a) {
            if (b.contains(n)) {
                interseccao.add(n);
            }
        }

        Collection<Integer> diferenca = new LinkedHashSet<>();
        for (int n : a) {
            if (!b.contains(n)) {
                diferenca.add(n);
            }
        }

        System.out.printf("A: %s\n", a);
        System.out.printf("B: %s\n", b);
        System.out.printf("União: %s\n", uniao);
        System.out.printf("Interseccao: %s\n", interseccao);
        System.out.printf("Diferença: %s\n", diferenca);
    }
}
