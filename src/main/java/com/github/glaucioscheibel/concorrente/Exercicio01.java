package com.github.glaucioscheibel.concorrente;

import java.util.Date;

public class Exercicio01 extends Thread {

    @Override
    public void run() {
        System.out.printf("%s: %tT\n", Thread.currentThread().getName(), new Date());
    }

    public static void main(String[] args) {
        Exercicio01[] exercs = new Exercicio01[10];
        for (int i = 0; i < 10; i++) {
            exercs[i] = new Exercicio01();
        }
        for (int i = 0; i < 10; i++) {
            exercs[i].start();
        }
    }
}
