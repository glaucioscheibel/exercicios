package com.github.glaucioscheibel.concorrente.exercicio03;

import java.util.Random;

public class Exercicio03 {

    static void main() {
        int cores = Runtime.getRuntime().availableProcessors();
        short[] numeros = new short[1_000_000_000];
        Random r = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (short) r.nextInt(1, Short.MAX_VALUE);
        }

        long hini = System.currentTimeMillis();
        long soma = 0;
        for (short numero : numeros) {
            soma += numero;
        }
        long millis = System.currentTimeMillis() - hini;
        System.out.printf("Total Sequencial: %,d%n", soma);
        System.out.printf("Tempo: %d milissegundos%n%n", millis);

        executa(numeros, 10, false, millis);
        executa(numeros, 100, false, millis);
        executa(numeros, cores, false, millis);
        executa(numeros, 10, true, millis);
        executa(numeros, 100, true, millis);
        executa(numeros, cores, true, millis);
    }

    private static void executa(short[] numeros, int qtdeThreads, boolean virtual, long sequential) {
        long hini = System.currentTimeMillis();
        int faixa = numeros.length / qtdeThreads;
        Soma[] somas = new Soma[qtdeThreads];
        // Cria e inicia as threads
        Thread[] threads = new Thread[qtdeThreads];
        int ini = 0;
        for (int i = 0; i < qtdeThreads; i++) {
            somas[i] = new Soma(numeros, ini, faixa);
            if (virtual) {
                threads[i] = Thread.ofVirtual().start(somas[i]);
            } else {
                threads[i] = Thread.ofPlatform().start(somas[i]);
            }
            ini += faixa;
        }
        // Aguarda o término das threads e soma os resultados
        long soma = 0;
        for (int i = 0; i < qtdeThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException _) {
                System.err.println("Thread interrompida");
            }
            soma += somas[i].getTotal();
        }
        long millis = System.currentTimeMillis() - hini;
        double speedup = (double) sequential / millis;
        double eficiencia = speedup / qtdeThreads * 100;
        System.out.printf("Total %d Threads %s: %,d%n", qtdeThreads, virtual ? "Virtuais" : "Nativas", soma);
        System.out.printf("Tempo: %d milissegundos %n", millis);
        System.out.printf("Speedup: %.2fx%n", speedup);
        System.out.printf("Eficiência: %.2f%%%n%n", eficiencia);
    }
}
