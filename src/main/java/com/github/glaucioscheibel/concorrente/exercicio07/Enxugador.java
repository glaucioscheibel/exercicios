package com.github.glaucioscheibel.concorrente.exercicio07;

public class Enxugador implements Runnable {
    private final PilhaPratos limpos;
    private final PilhaPratos escorredor;

    public Enxugador(PilhaPratos limpos, PilhaPratos escorredor) {
        this.limpos = limpos;
        this.escorredor = escorredor;
    }

    public void run() {
        Prato prato;
        try {
            do {
                prato = escorredor.retirarPrato();
                if (prato != null) {
                    enxugar(prato);
                    limpos.colocarPrato(prato);
                }
            } while (prato != null);
        } catch (InterruptedException _) {
            Thread.currentThread().interrupt();
            System.out.printf("%s foi interrompido%n", Thread.currentThread().getName());
        }
        System.out.printf("%s terminou%n", Thread.currentThread().getName());
    }

    private void enxugar(Prato prato) {
        prato.setEstado(Estado.LIMPO);
        System.out.printf("%s sequei prato %d%n", Thread.currentThread().getName(), prato.getId());
    }
}
