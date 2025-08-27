package com.github.glaucioscheibel.concorrente.exercicio03;

import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[1_000_000_000];
        Random r = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(1, 100_000);
        }

        // Sequencial
        long hini = System.currentTimeMillis();
        long soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.printf("Total Sequencial: %d\n", soma);
        System.out.printf("Tempo: %d milisegundos\n\n", System.currentTimeMillis() - hini);

        // 10 Threads de plataforma
        hini = System.currentTimeMillis();
        int faixa = numeros.length / 10;
        Soma[] somas = new Soma[10];
        Thread[] threads = new Thread[10];
        int ini = 0;
        for (int i = 0; i < 10; i++) {
            somas[i] = new Soma(numeros, ini, faixa);
            threads[i] = Thread.ofPlatform().start(somas[i]);
            ini += faixa;
        }
        soma = 0;
        for (int i = 0; i < 10; i++) {
            threads[i].join();
            soma += somas[i].getSoma();
        }
        System.out.printf("Total 10 Threads Plat: %d\n", soma);
        System.out.printf("Tempo: %d milisegundos \n\n", System.currentTimeMillis() - hini);

        // 100 Threads de plataforma
        hini = System.currentTimeMillis();
        faixa = numeros.length / 100;
        somas = new Soma[100];
        threads = new Thread[100];
        ini = 0;
        for (int i = 0; i < 100; i++) {
            somas[i] = new Soma(numeros, ini, faixa);
            threads[i] = Thread.ofPlatform().start(somas[i]);
            ini += faixa;
        }
        soma = 0;
        for (int i = 0; i < 100; i++) {
            threads[i].join();
            soma += somas[i].getSoma();
        }
        System.out.printf("Total 100 Threads Plat: %d\n", soma);
        System.out.printf("Tempo: %d milisegundos \n\n", System.currentTimeMillis() - hini);

        // 10 Threads virtuais
        hini = System.currentTimeMillis();
        faixa = numeros.length / 10;
        somas = new Soma[10];
        threads = new Thread[10];
        ini = 0;
        for (int i = 0; i < 10; i++) {
            somas[i] = new Soma(numeros, ini, faixa);
            threads[i] = Thread.ofVirtual().start(somas[i]);
            ini += faixa;
        }
        soma = 0;
        for (int i = 0; i < 10; i++) {
            threads[i].join();
            soma += somas[i].getSoma();
        }
        System.out.printf("Total 10 Threads Virt: %d\n", soma);
        System.out.printf("Tempo: %d milisegundos \n\n", System.currentTimeMillis() - hini);

        // 100 Threads virtuais
        hini = System.currentTimeMillis();
        faixa = numeros.length / 100;
        somas = new Soma[100];
        threads = new Thread[100];
        ini = 0;
        for (int i = 0; i < 100; i++) {
            somas[i] = new Soma(numeros, ini, faixa);
            threads[i] = Thread.ofVirtual().start(somas[i]);
            ini += faixa;
        }
        soma = 0;
        for (int i = 0; i < 100; i++) {
            threads[i].join();
            soma += somas[i].getSoma();
        }
        System.out.printf("Total 100 Threads Virt: %d\n", soma);
        System.out.printf("Tempo: %d milisegundos \n\n", System.currentTimeMillis() - hini);
    }
}
