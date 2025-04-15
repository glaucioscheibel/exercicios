package com.github.glaucioscheibel.concorrente.exercicio05;

public class Lavador extends Thread {
    private PilhaSuja pilhaSuja;
    private Escorredor escorredor;

    public Lavador(PilhaSuja pilhaSuja, Escorredor escorredor) {
        this.pilhaSuja = pilhaSuja;
        this.escorredor = escorredor;
    }

    @Override
    public void run() {
        int prato;
        while ((prato = pilhaSuja.getPratoSujo()) != 0) {
            lavarPrato(prato);
            escorredor.poe(prato);
        }
        escorredor.setFim(true);
    }

    private void lavarPrato(int prato) {
        System.out.printf("Lavando prato %d\n", prato);
    }
}
