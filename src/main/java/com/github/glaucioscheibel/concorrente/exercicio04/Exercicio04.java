package com.github.glaucioscheibel.concorrente.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Insere i1 = new Insere(numeros);
        Insere i2 = new Insere(numeros);
        Remove r1 = new Remove(numeros);
        Imprime p1 = new Imprime(numeros);
        i1.start();
        i2.start();
        r1.start();
        p1.start();
    }
}
