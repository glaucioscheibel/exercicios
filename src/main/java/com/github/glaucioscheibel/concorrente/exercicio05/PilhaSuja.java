package com.github.glaucioscheibel.concorrente.exercicio05;

public class PilhaSuja {
    private int pratos;
    private int qtde;

    public PilhaSuja(int qtde) {
        this.qtde = qtde;
    }

    public synchronized int nextPrato() {
        pratos++;
        if (pratos <= qtde) {
            return pratos;
        }
        return 0;
    }
}
