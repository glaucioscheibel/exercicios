package com.github.glaucioscheibel.concorrente.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;
    private volatile int transacoes;
    private Object monitor;

    public Banco(int qtdeContas, double saldoInicial) {
        contas = new ArrayList<>();
        for (int i = 0; i < qtdeContas; i++) {
            contas.add(new Conta(saldoInicial));
        }
        monitor = new Object();
    }

    public void transferencia(int contaDebito, int contaCredito, double valor) {
        if (contaDebito == contaCredito) {
            return;
        }
        synchronized (monitor) {
            int menor = Math.min(contaDebito, contaCredito);
            int maior = Math.max(contaDebito, contaCredito);
            synchronized (contas.get(menor)) {
                synchronized (contas.get(maior)) {
                    contas.get(contaDebito).saque(valor);
                    contas.get(contaCredito).deposito(valor);
                }
            }
            transacoes++;
        }
    }

    public double getSaldoTotal() {
        synchronized (monitor) {
            double saldoTotal = 0D;
            for (Conta conta : contas) {
                saldoTotal += conta.getSaldo();
            }
            return saldoTotal;
        }
    }

    public int getTransacoes() {
        return transacoes;
    }
}
