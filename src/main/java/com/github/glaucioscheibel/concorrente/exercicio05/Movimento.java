package com.github.glaucioscheibel.concorrente.exercicio05;

import java.util.Random;

public class Movimento extends Thread {
    private Banco banco;

    public Movimento(Banco banco) {
        this.banco = banco;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            banco.transferencia(random.nextInt(100), random.nextInt(100), random.nextDouble(2500D));
        }
    }
}
