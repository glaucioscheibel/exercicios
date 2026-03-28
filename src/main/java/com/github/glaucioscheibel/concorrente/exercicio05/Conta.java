package com.github.glaucioscheibel.concorrente.exercicio05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Conta {
    private double saldo;
    private Lock lock;

    public Conta(double saldo) {
        this.saldo = saldo;
        this.lock = new ReentrantLock();
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

    public void lock() {
        lock.lock();
    }

    public void unlock() {
        lock.unlock();
    }
}
