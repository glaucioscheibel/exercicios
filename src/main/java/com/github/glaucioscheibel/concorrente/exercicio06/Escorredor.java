package com.github.glaucioscheibel.concorrente.exercicio06;

import java.util.LinkedList;
import java.util.Queue;

public class Escorredor {
    private final Queue<Prato> espacos;
    private volatile boolean fim;

    public Escorredor() {
        espacos = new LinkedList<>();
    }

    public void fim() {
        fim = true;
    }

    public boolean isFim() {
        return fim;
    }

    public synchronized void poe(Prato prato) {
        while (espacos.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        espacos.add(prato);
        notifyAll();
    }

    public synchronized Prato tira() {
        while (!fim && espacos.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        notifyAll();
        if (fim && espacos.isEmpty()) {
            return null;
        }
        return espacos.poll();
    }
}
