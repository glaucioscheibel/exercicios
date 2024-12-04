package com.github.glaucioscheibel.concorrente;

public class Exercicio02 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s: %d\n", Thread.currentThread().getName(), i);
        }
    }

    public static void main(String[] args) {
        Exercicio02[] exercs = new Exercicio02[10];
        for (int i = 0; i < 10; i++) {
            exercs[i] = new Exercicio02();
        }
        for (int i = 0; i < 10; i++) {
            exercs[i].start();
        }
    }
}
