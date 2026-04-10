package com.github.glaucioscheibel.concorrente.exercicio06;

public class PilhaPratos {
    private Prato[] pratos;
    private volatile int qtde;

    public PilhaPratos(int tamanho) {
        pratos = new Prato[tamanho];
    }

    public synchronized void addPrato(Prato prato) {
        while (qtde >= pratos.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        pratos[qtde] = prato;
        qtde++;
        notifyAll();
    }

    public synchronized Prato removePrato() {
        if (qtde <= 0) {
            try {
                wait(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        if (qtde > 0) {
            qtde--;
            Prato prato = pratos[qtde];
            pratos[qtde] = null;
            notifyAll();
            return prato;
        } else {
            return null;
        }
    }

    public synchronized boolean temPrato() {
        return qtde > 0;
    }

    public synchronized boolean temEspaco() {
        return qtde < pratos.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilhaPratos : [");
        for (int i = 0; i < qtde; i++) {
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

    public int getQtde() {
        return qtde;
    }
}
