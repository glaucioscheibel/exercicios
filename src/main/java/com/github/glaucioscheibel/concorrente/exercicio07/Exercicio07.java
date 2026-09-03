package com.github.glaucioscheibel.concorrente.exercicio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exercicio07 {
    void main() {
        short[] numeros = new short[1_000_000_000];
        Random r = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (short) r.nextInt(1, Short.MAX_VALUE);
        }

        long ini = System.currentTimeMillis();
        long soma = 0;
        for (short numero : numeros) {
            soma += numero;
        }
        long millis = System.currentTimeMillis() - ini;
        System.out.printf("Total Sequencial: %,d%n", soma);
        System.out.printf("Tempo: %d milissegundos%n%n", millis);

        executa(Executors.newSingleThreadExecutor(), numeros, 1, "nativa", millis);
        executa(Executors.newThreadPerTaskExecutor(Thread.ofPlatform().factory()), numeros, 10, "nativas", millis);
        executa(Executors.newThreadPerTaskExecutor(Thread.ofPlatform().factory()), numeros, 100, "nativas", millis);
        executa(Executors.newVirtualThreadPerTaskExecutor(), numeros, 10, "virtuais", millis);
        executa(Executors.newVirtualThreadPerTaskExecutor(), numeros, 100, "virtuais", millis);
        executa(Executors.newCachedThreadPool(), numeros, 10, "com cache", millis);
        executa(Executors.newCachedThreadPool(), numeros, 100, "com cache", millis);
        executa(Executors.newWorkStealingPool(), numeros, 10, "com work stealing", millis);
        executa(Executors.newWorkStealingPool(), numeros, 100, "com work stealing", millis);
    }

    private static void executa(
            ExecutorService executor, short[] numeros, int numThreads, String descricao, long tempoBase) {
        long timer = System.currentTimeMillis();
        int faixa = numeros.length / numThreads;
        List<Future<Long>> futureList = new ArrayList<>();
        int ini = 0;

        for (int i = 0; i < numThreads; i++) {
            futureList.add(executor.submit(new Soma(numeros, ini, faixa)));
            ini += faixa;
        }
        long soma = 0;
        for (Future<Long> future : futureList) {
            try {
                soma += future.get();
            } catch (InterruptedException | ExecutionException _) {
                System.err.println("Erro ao obter resultado da thread");
            }
        }
        timer = System.currentTimeMillis() - timer;
        double speedup = (double) tempoBase / timer;
        double eficiencia = speedup / numThreads * 100;
        System.out.printf("Total %d Threads %s: %,d%n", numThreads, descricao, soma);
        System.out.printf("Tempo: %d milissegundos %n", timer);
        System.out.printf("Speedup: %.2fx%n", speedup);
        System.out.printf("Eficiência: %.2f%%%n%n", eficiencia);
        executor.close();
    }
}
