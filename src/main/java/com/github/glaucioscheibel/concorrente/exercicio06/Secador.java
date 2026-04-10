package com.github.glaucioscheibel.concorrente.exercicio06;

public class Secador implements Runnable {
    private PilhaPratos limpos;
    private PilhaPratos escorredor;

    public Secador(PilhaPratos limpos, PilhaPratos escorredor) {
        this.limpos = limpos;
        this.escorredor = escorredor;
    }

    public void run() {
        Prato prato = null;
        do {
            prato = escorredor.removePrato();
            if (prato != null) {
                secar(prato);
                synchronized (limpos) {
                    limpos.addPrato(prato);
                }
            }
        } while (limpos.temEspaco());
        System.out.printf("%s terminou\n", Thread.currentThread().getName());
    }

    private void secar(Prato prato) {
        prato.setEstado(Estado.LIMPO);
        System.out.printf("%s sequei prato %d\n", Thread.currentThread().getName(), prato.getId());
        Thread.yield();
    }
}
