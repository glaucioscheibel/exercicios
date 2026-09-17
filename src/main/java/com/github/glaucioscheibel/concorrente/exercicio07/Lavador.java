package com.github.glaucioscheibel.concorrente.exercicio07;

public class Lavador implements Runnable {
    private final PilhaPratos sujos;
    private final PilhaPratos escorredor;

    public Lavador(PilhaPratos sujos, PilhaPratos escorredor) {
        this.sujos = sujos;
        this.escorredor = escorredor;
    }

    @Override
    public void run() {
        try {
            Prato prato;
            do {
                prato = sujos.retirarPrato();
                if (prato != null) {
                    lavar(prato);
                    escorredor.colocarPrato(prato);
                }
            } while (prato != null);
        } catch (InterruptedException _) {
            Thread.currentThread().interrupt();
            System.out.printf("%s foi interrompido%n", Thread.currentThread().getName());
        }
        System.out.printf("%s terminou%n", Thread.currentThread().getName());
    }

    public void lavar(Prato prato) {
        prato.setEstado(Estado.MOLHADO);
        System.out.printf("%s lavou prato %d%n", Thread.currentThread().getName(), prato.getId());
    }
}
