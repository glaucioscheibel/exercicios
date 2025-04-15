package com.github.glaucioscheibel.concorrente.exercicio05;

public class Escorredor {
    int[] espacos = new int[10];
    int livre = 0;
    boolean fim;

    public synchronized void poe(int prato) {
        while (livre == espacos.length - 1) {
            try {
                wait();
            } catch (InterruptedException ie) {
            }
        }
        livre++;
        espacos[livre] = prato;
        notifyAll();
    }

    public synchronized int tira() {
        while (livre == 0 && !fim) {
            try {
                wait();
            } catch (InterruptedException ie) {
            }
        }
        if (!fim) {
            int prato = espacos[livre];
            livre--;
            notifyAll();
            return prato;
        } else {
            return 0;
        }
    }

    public synchronized void setFim(boolean fim) {
        this.fim = fim;
    }

    public synchronized boolean isFim() {
        return fim && livre == 0;
    }
}
