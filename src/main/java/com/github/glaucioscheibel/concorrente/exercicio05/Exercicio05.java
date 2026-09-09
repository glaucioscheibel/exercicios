package com.github.glaucioscheibel.concorrente.exercicio05;

public class Exercicio05 {
    private static final int TRES_MINUTOS = 3 * 60 * 1000;

    static void main() throws Exception {
        Banco firmeza = new Banco(100, 1000D);
        firmeza.imprimeSaldoContas();
        for (int i = 0; i < 5; i++) {
            Thread.ofVirtual().start(new Movimento(firmeza));
        }
        long ini = System.currentTimeMillis();
        do {
            Thread.sleep(5000);
            firmeza.imprimeSaldoContas();
        } while (System.currentTimeMillis() - ini < TRES_MINUTOS);
    }
}
