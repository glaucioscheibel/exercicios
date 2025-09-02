package com.github.glaucioscheibel.concorrente.exercicio05;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        saldo = saldo + valor;
    }

    public void saque(double valor) {
        saldo = saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
