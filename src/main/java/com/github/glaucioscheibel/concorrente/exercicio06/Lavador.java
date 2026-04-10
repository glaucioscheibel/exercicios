package com.github.glaucioscheibel.concorrente.exercicio06;

public class Lavador implements Runnable {
    private final PilhaPratos sujos;
    private final PilhaPratos escorredor;

    public Lavador(PilhaPratos sujos, PilhaPratos escorredor) {
        this.sujos = sujos;
        this.escorredor = escorredor;
    }

    @Override
    public void run() {
        while (sujos.temPrato()) {
            Prato prato;
            synchronized (sujos) {
                prato = sujos.removePrato();
            }
            lavar(prato);
            escorredor.addPrato(prato);
        }
        System.out.printf("%s terminou\n", Thread.currentThread().getName());
    }

    public void lavar(Prato prato) {
        prato.setEstado(Estado.MOLHADO);
        System.out.printf("%s lavou prato %d\n", Thread.currentThread().getName(), prato.getId());
    }
}
