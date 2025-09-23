package com.github.glaucioscheibel.concorrente.exercicio06;

import java.util.List;

public class Lavador implements Runnable {
    private final List<Prato> sujos;
    private final Escorredor escorredor;

    public Lavador(List<Prato> sujos, Escorredor escorredor) {
        this.sujos = sujos;
        this.escorredor = escorredor;
    }

    @Override
    public void run() {
        while (!sujos.isEmpty()) {
            Prato prato = sujos.removeFirst();
            lavar(prato);
            escorredor.poe(prato);
        }
        escorredor.fim();
        System.out.println("Lavador terminou");
    }

    public void lavar(Prato prato) {
        prato.setEstado(Estado.MOLHADO);
        System.out.println("Lavei prato " + prato.getId());
    }
}
