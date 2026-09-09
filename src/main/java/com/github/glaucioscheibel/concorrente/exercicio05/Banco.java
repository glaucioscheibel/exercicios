package com.github.glaucioscheibel.concorrente.exercicio05;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

public class Banco {
    private final Map<Integer, Conta> contas;
    private final AtomicLong transacoes;
    private long transacoesDoSaldo;

    public Banco(int qtdeContas, double saldoInicial) {
        transacoes = new AtomicLong();
        contas = new TreeMap<>();
        for (int i = 1; i <= qtdeContas; i++) {
            contas.put(i, new Conta(i, saldoInicial));
        }
        System.out.printf("Banco criado com %d contas com saldo inicial de %,.2f%n", qtdeContas, saldoInicial);
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
        for (Conta conta : contas.values()) {
            conta.lock();
        }
        transacoesDoSaldo = getTransacoes();
        for (Conta conta : contas.values()) {
            saldoTotal += conta.getSaldo();
            conta.unlock();
        }
        return saldoTotal;
    }

    public long getTransacoes() {
        return transacoes.get();
    }

    public void imprimeSaldoContas() {
        System.out.printf("Saldo do banco: %,.2f Transações: %,d%n", getSaldoTotal(), transacoesDoSaldo);
    }
}
