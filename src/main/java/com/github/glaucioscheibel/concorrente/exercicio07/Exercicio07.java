package com.github.glaucioscheibel.concorrente.exercicio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exercicio07 {
    public static void main(String[] args) throws Exception {
        short[] numeros = new short[1_000_000_000];
        Random r = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (short) r.nextInt(1, Short.MAX_VALUE);
        }

        System.out.printf(
                "Seu computador tem %d núcleos \n\n", Runtime.getRuntime().availableProcessors());

        executa(Executors.newSingleThreadExecutor(), numeros, 1, "de Plataforma");
        executa(Executors.newThreadPerTaskExecutor(Thread.ofPlatform().factory()), numeros, 10, "de Plataforma");
        executa(Executors.newThreadPerTaskExecutor(Thread.ofPlatform().factory()), numeros, 100, "de Plataforma");
        executa(Executors.newVirtualThreadPerTaskExecutor(), numeros, 10, "virtuais");
        executa(Executors.newVirtualThreadPerTaskExecutor(), numeros, 100, "virtuais");
        executa(Executors.newCachedThreadPool(), numeros, 10, "com cache");
        executa(Executors.newCachedThreadPool(), numeros, 100, "com cache");
        executa(Executors.newWorkStealingPool(), numeros, 10, "com work stealing");
        executa(Executors.newWorkStealingPool(), numeros, 100, "com work stealing");
    }

    private static void executa(ExecutorService executor, short[] numeros, int numThreads, String descricao)
            throws Exception {
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
            soma += future.get();
        }
        System.out.printf("Total %d Threads %s: %,d\n", numThreads, descricao, soma);
        System.out.printf("Tempo: %d milisegundos \n\n", System.currentTimeMillis() - timer);
        executor.close();
    }
}
