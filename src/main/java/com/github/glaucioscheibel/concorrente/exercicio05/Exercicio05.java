package com.github.glaucioscheibel.concorrente.exercicio05;

public class Exercicio05 {
    private static final int _3_MINUTOS = 3 * 60 * 1000;

    public static void main(String[] args) throws Exception {
        Banco firmeza = new Banco(100, 1000D);
        System.out.printf("Saldo do banco: %,.2f Transações %,d\n", firmeza.getSaldoTotal(), firmeza.getTransacoes());
        Thread.ofVirtual().start(new Movimento(firmeza));
        Thread.ofVirtual().start(new Movimento(firmeza));
        Thread.ofVirtual().start(new Movimento(firmeza));
        Thread.ofVirtual().start(new Movimento(firmeza));
        Thread.ofVirtual().start(new Movimento(firmeza));
        long ini = System.currentTimeMillis();
        while (true) {
            Thread.sleep(5000);
            System.out.printf(
                    "Saldo do banco: %,.2f Transações %,d\n", firmeza.getSaldoTotal(), firmeza.getTransacoes());
            if (System.currentTimeMillis() - ini >= _3_MINUTOS) {
                break;
            }
        }
    }
}
