package com.github.glaucioscheibel.concorrente.exercicio06;

import java.util.List;

public class Secador implements Runnable {
    private List<Prato> limpos;
    private Escorredor escorredor;

    public Secador(List<Prato> limpos, Escorredor escorredor) {
        this.limpos = limpos;
        this.escorredor = escorredor;
    }

    public void run() {
        while (!escorredor.isFim()) {
            Prato prato = escorredor.tira();
            if (prato != null) {
                secar(prato);
                synchronized (limpos) {
                    limpos.add(prato);
                }
            }
        }
        System.out.println("Secador terminou");
    }

    private void secar(Prato prato) {
        prato.setEstado(Estado.LIMPO);
        System.out.println("Sequei prato " + prato.getId());
    }
}
