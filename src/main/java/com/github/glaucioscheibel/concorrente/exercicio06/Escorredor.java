package com.github.glaucioscheibel.concorrente.exercicio06;

public class Escorredor {
    private int[] espacos;
    private int livre = 0;
    private boolean fim;

    public Escorredor(int tam) {
        espacos = new int[tam];
    }

    public synchronized void poe(int prato) {
        while (livre >= espacos.length) {
            try {
                wait();
            } catch (InterruptedException ie) {
            }
        }
        System.out.printf("Colocando prato %d\n", prato);
        espacos[livre] = prato;
        livre++;
        notifyAll();
    }

    public synchronized int retira() {
        while (livre == 0 && !fim) {
            try {
                wait();
            } catch (InterruptedException ie) {
            }
        }
        notifyAll();
        if (fim && livre == 0) {
            return 0;
        }
        livre--;
        System.out.printf("Retirando prato %d\n", espacos[livre]);
        return espacos[livre];
    }

    public void setFim() {
        fim = true;
    }
}
