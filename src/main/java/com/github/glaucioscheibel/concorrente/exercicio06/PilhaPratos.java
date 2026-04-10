package com.github.glaucioscheibel.concorrente.exercicio06;

import java.util.concurrent.atomic.AtomicInteger;

public class PilhaPratos {
    private Prato[] pratos;
    private AtomicInteger qtde = new AtomicInteger(0);

    public PilhaPratos(int tamanho) {
        pratos = new Prato[tamanho];
    }

    public synchronized void addPrato(Prato prato) {
        while (qtde.get() >= pratos.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        pratos[qtde.get()] = prato;
        qtde.incrementAndGet();
        notifyAll();
    }

    public synchronized Prato removePrato() {
        if (qtde.get() <= 0) {
            try {
                wait(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        if (qtde.get() > 0) {
            qtde.decrementAndGet();
            Prato prato = pratos[qtde.get()];
            pratos[qtde.get()] = null;
            notifyAll();
            return prato;
        } else {
            return null;
        }
    }

    public synchronized boolean temPrato() {
        return qtde.get() > 0;
    }

    public synchronized boolean temEspaco() {
        return qtde.get() < pratos.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilhaPratos : [");
        for (int i = 0; i < qtde.get(); i++) {
            if (pratos[i] != null) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(pratos[i]);
            } else {
                break;
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
