package com.github.glaucioscheibel.concorrente.exercicio04;

import java.util.List;
import java.util.Random;

public class Insere extends Thread {
    private final List<Integer> numeros;
    private final Random random;

    public Insere(List<Integer> numeros) {
        this.numeros = numeros;
        random = new Random();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (numeros) {
                numeros.add(random.nextInt(10_000));
            }
        }
    }
}
