package com.github.glaucioscheibel.concorrente.exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Banco {
    private List<Conta> contas;
    private AtomicLong transacoes;

    public Banco(int qtdeContas, double saldoInicial) {
        transacoes = new AtomicLong();
        contas = new ArrayList<>();
        for (int i = 0; i < qtdeContas; i++) {
            contas.add(new Conta(saldoInicial));
        }
    }

    public void transferencia(int contaDebito, int contaCredito, double valor) {
        if (contaDebito == contaCredito) {
            return;
        }
        int menor = Math.min(contaDebito, contaCredito);
        int maior = Math.max(contaDebito, contaCredito);
        contas.get(menor).lock();
        contas.get(maior).lock();
        contas.get(contaDebito).saque(valor);
        contas.get(contaCredito).deposito(valor);
        contas.get(menor).unlock();
        contas.get(maior).unlock();
        transacoes.incrementAndGet();
    }

    public double getSaldoTotal() {
        double saldoTotal = 0D;
        for (Conta conta : contas) {
            conta.lock();
        }
        for (Conta conta : contas) {
            saldoTotal += conta.getSaldo();
            conta.unlock();
        }
        return saldoTotal;
    }

    public long getTransacoes() {
        return transacoes.get();
    }
}
