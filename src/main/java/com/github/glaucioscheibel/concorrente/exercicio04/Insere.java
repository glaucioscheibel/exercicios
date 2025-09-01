package com.github.glaucioscheibel.concorrente.exercicio04;

import java.util.List;
import java.util.Random;

public class Insere extends Thread {
    private List<Integer> numeros;

    public Insere(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            synchronized (numeros) {
                numeros.add(r.nextInt(10_000));
            }
        }
    }
}
