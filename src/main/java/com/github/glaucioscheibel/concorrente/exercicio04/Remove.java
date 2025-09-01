package com.github.glaucioscheibel.concorrente.exercicio04;

import java.util.List;

public class Remove extends Thread {
    private List<Integer> numeros;

    public Remove(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (numeros) {
                if (!numeros.isEmpty()) {
                    numeros.removeFirst();
                }
            }
        }
    }
}
