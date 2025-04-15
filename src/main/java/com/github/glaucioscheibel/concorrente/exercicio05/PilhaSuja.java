package com.github.glaucioscheibel.concorrente.exercicio05;

public class PilhaSuja {
    private int prato;
    private int total;

    public PilhaSuja(int total) {
        this.total = total;
    }

    public synchronized int getPratoSujo() {
        if (prato >= total) {
            return 0;
        }
        return ++prato;
    }
}
