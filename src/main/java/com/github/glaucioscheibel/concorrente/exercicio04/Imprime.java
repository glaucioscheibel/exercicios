package com.github.glaucioscheibel.concorrente.exercicio04;

import java.util.List;

public class Imprime extends Thread {
    private List<Integer> numeros;

    public Imprime(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (numeros) {
                System.out.println(numeros);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
            }
        }
    }
}
