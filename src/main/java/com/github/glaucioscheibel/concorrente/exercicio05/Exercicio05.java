package com.github.glaucioscheibel.concorrente.exercicio05;

public class Exercicio05 {
    private static final int _3_MINUTOS = 3 * 60 * 1000;

    void main() throws Exception {
        Banco firmeza = new Banco(100, 1000D);
        System.out.printf("Saldo do banco: %,.2f Transações %,d%n", firmeza.getSaldoTotal(), firmeza.getTransacoes());
        for (int i = 0; i < 5; i++) {
            Thread.ofVirtual().start(new Movimento(firmeza));
        }
        long ini = System.currentTimeMillis();
        do {
            Thread.sleep(5000);
            System.out.printf(
                    "Saldo do banco: %,.2f Transações: %,d%n", firmeza.getSaldoTotal(), firmeza.getTransacoes());
        } while (System.currentTimeMillis() - ini < _3_MINUTOS);
    }
}
