package com.github.glaucioscheibel.concorrente.exercicio07;

import java.util.LinkedList;
import java.util.Queue;

public class PilhaPratos {
    private final String nome;
    private final Queue<Prato> pratos;
    private final int capacidade;
    private final int totalPratos;
    private volatile int pratosAcessados;

    public PilhaPratos(String nome, int totalPratos) {
        this(nome, totalPratos, totalPratos);
    }

    public PilhaPratos(String nome, int capacidade, int totalPratos) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.totalPratos = totalPratos;
        pratos = new LinkedList<>();
    }

    public synchronized void colocarPrato(Prato prato) throws InterruptedException {
        while (pratos.size() == capacidade) {
            System.out.printf(
                    "%s esperando para colocar prato %d no %s.%n",
                    Thread.currentThread().getName(), prato.getId(), nome);
            wait();
        }

        pratos.add(prato);
        pratosAcessados++;
        System.out.printf(
                "%s Colocou o prato %d no %s. (%s: %d/%d)%n",
                Thread.currentThread().getName(), prato.getId(), nome, nome, pratos.size(), capacidade);

        notifyAll();
    }

    public synchronized Prato retirarPrato() throws InterruptedException {
        while (pratos.isEmpty()) {
            if (pratosAcessados >= totalPratos) {
                return null;
            }
            System.out.printf(
                    "%s esperando para retirar prato do %s.%n",
                    Thread.currentThread().getName(), nome);
            wait();
        }

        Prato prato = pratos.poll();
        System.out.printf(
                "%s Retirou o prato %d do %s. (%s: %d/%d)%n",
                Thread.currentThread().getName(), prato.getId(), nome, nome, pratos.size(), capacidade);

        notifyAll();
        return prato;
    }

    public synchronized int getQuantidade() {
        return pratos.size();
    }

    @Override
    public String toString() {
        return nome + ":" + pratos;
    }
}
