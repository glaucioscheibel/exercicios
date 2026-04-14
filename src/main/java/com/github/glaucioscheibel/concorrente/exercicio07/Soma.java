package com.github.glaucioscheibel.concorrente.exercicio07;

import java.util.concurrent.Callable;

public class Soma implements Callable<Long> {
    private short[] numeros;
    private int ini;
    private int qtde;

    public Soma(short[] numeros, int ini, int qtde) {
        this.numeros = numeros;
        this.ini = ini;
        this.qtde = qtde;
    }

    @Override
    public Long call() {
        long soma = 0;
        for (int i = ini; i < ini + qtde; i++) {
            soma += numeros[i];
        }
        return soma;
    }
}
