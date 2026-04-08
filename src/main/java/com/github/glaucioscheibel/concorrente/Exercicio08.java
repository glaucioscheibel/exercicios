package com.github.glaucioscheibel.concorrente;

import java.util.concurrent.atomic.AtomicInteger;

public class Exercicio08 {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

    public static void main(String[] args) throws Exception {
        Exercicio08 contador = new Exercicio08();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(contador.getCount());
    }
}
