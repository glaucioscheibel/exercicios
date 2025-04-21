package com.github.glaucioscheibel.concorrente.exercicio05;

public class Enxugador extends Thread {
    private Escorredor escorredor;
    private PilhaLimpa limpos;

    public Enxugador(Escorredor escorredor, PilhaLimpa limpos) {
        this.escorredor = escorredor;
        this.limpos = limpos;
    }

    public void run() {
        int prato;
        while ((prato = escorredor.retira()) != 0) {
            enxuga(prato);
            limpos.poe(prato);
        }
    }

    private void enxuga(int prato) {
        System.out.printf("Enxugando prato %d\n", prato);
    }
}
