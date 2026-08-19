package com.github.glaucioscheibel.concorrente.exercicio03;

public class Soma implements Runnable {
    private final short[] numeros;
    private final int ini;
    private final int qtde;
    private long total;

    public Soma(short[] numeros, int ini, int qtde) {
        this.numeros = numeros;
        this.ini = ini;
        this.qtde = qtde;
    }

    @Override
    public void run() {
        for (int i = ini; i < ini + qtde; i++) {
            total += numeros[i];
        }
    }

    public long getTotal() {
        return total;
    }
}
