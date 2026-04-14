package com.github.glaucioscheibel.concorrente;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public class Exercicio08 {
    public static void main(String[] args) {
        AtomicInteger total = new AtomicInteger();
        try {
            while (true) {
                Thread.ofPlatform().start(() -> {
                    total.incrementAndGet();
                    LockSupport.park();
                });
            }
        } catch (OutOfMemoryError error) {
            System.out.printf("Consegui criar %d threads.\n", total.get());
            throw error;
        }
    }
}
