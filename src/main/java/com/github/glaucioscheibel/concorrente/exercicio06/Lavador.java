package com.github.glaucioscheibel.concorrente.exercicio06;

public class Lavador extends Thread {
    private PilhaSuja sujos;
    private Escorredor escorredor;

    public Lavador(PilhaSuja sujos, Escorredor escorredor) {
        this.sujos = sujos;
        this.escorredor = escorredor;
    }

    public void run() {
        int prato;
        while ((prato = sujos.nextPrato()) != 0) {
            lavar(prato);
            escorredor.poe(prato);
        }
        escorredor.setFim();
    }

    private static void lavar(int prato) {
        System.out.printf("Lavando prato %d\n", prato);
    }
}
