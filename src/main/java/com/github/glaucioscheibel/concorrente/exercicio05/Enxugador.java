package com.github.glaucioscheibel.concorrente.exercicio05;

public class Enxugador extends Thread {
    private Escorredor escorredor;
    private PilhaSeca pilhaSeca;

    public Enxugador(Escorredor escorredor, PilhaSeca pilhaSeca) {
        this.escorredor = escorredor;
        this.pilhaSeca = pilhaSeca;
    }

    @Override
    public void run() {
        int prato = -1;

        while (prato != 0) {
            prato = escorredor.tira();
            if (prato != 0) {
                enxuga(prato);
                pilhaSeca.poe(prato);
            }
        }
    }

    public void enxuga(int prato) {
        System.out.printf("Enxugando prato %d\n", prato);
    }
}
