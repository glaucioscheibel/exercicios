package com.github.glaucioscheibel.concorrente.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;
    private int transacoes;

    public Banco(int qtdeContas, double saldoInicial) {
        contas = new ArrayList<>();
        for (int i = 0; i < qtdeContas; i++) {
            contas.add(new Conta(saldoInicial));
        }
    }

    public synchronized void transferencia(int contaDebito, int contaCredito, double valor) {
        contas.get(contaDebito).saque(valor);
        contas.get(contaCredito).deposito(valor);
        transacoes++;
    }

    public synchronized double getSaldoTotal() {
        double saldoTotal = 0D;
        for (Conta conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }

    public int getTransacoes() {
        return transacoes;
    }
}
