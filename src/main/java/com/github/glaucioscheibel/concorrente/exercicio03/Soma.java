package com.github.glaucioscheibel.concorrente.exercicio03;

public class Soma implements Runnable {
    private short[] numeros;
    private int ini;
    private int qtde;
    private long soma;

    public Soma(short[] numeros, int ini, int qtde) {
        this.numeros = numeros;
        this.ini = ini;
        this.qtde = qtde;
    }

    @Override
    public void run() {
        for (int i = ini; i < ini + qtde; i++) {
            soma += numeros[i];
        }
    }

    public long getSoma() {
        return soma;
    }
}
