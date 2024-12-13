package com.github.glaucioscheibel.concorrente;

import java.util.Random;

public class Exercicio03 extends Thread {
    private int[] numeros;
    private int inicio;
    private int fim;
    private long total;

    public Exercicio03(int[] numeros, int inicio, int fim) {
        this.numeros = numeros;
        this.inicio = inicio;
        this.fim = fim;
    }

    public void run() {
        for (int i = this.inicio; i < this.fim; i++) {
            this.total += this.numeros[i];
        }
    }

    public long getTotal() {
        return this.total;
    }

    public static void main(String[] args) throws Exception {
        int[] numeros = new int[10_000_000];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(numeros.length);
        }
        long ini = System.currentTimeMillis();
        long total = 0;
        for (int n : numeros) {
            total += n;
        }
        System.out.printf("Sequencial: %d em %d milisegundos\n", total, (System.currentTimeMillis() - ini));

        for (int qtde : new int[] {10, 100}) {
            ini = System.currentTimeMillis();
            Exercicio03[] threads = new Exercicio03[qtde];
            total = 0;
            int aux = 0;
            int faixa = numeros.length / qtde;
            for (int i = 0; i < qtde; i++) {
                threads[i] = new Exercicio03(numeros, aux, aux + faixa);
                aux += faixa;
            }
            for (Exercicio03 thread : threads) {
                thread.start();
            }
            for (Exercicio03 thread : threads) {
                thread.join();
                total += thread.getTotal();
            }
            System.out.printf("%d Threads: %d em %d milisegundos\n", qtde, total, (System.currentTimeMillis() - ini));
        }
    }
}
