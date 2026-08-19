package com.github.glaucioscheibel.concorrente.exercicio05;

import java.util.Random;

public class Movimento implements Runnable {
    private final Banco banco;
    private final Random random;

    public Movimento(Banco banco) {
        this.banco = banco;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            banco.transferencia(random.nextInt(100), random.nextInt(100), random.nextDouble(2500D));
        }
    }
}
