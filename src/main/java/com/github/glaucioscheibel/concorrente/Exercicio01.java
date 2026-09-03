package com.github.glaucioscheibel.concorrente;

import java.time.LocalTime;

public class Exercicio01 extends Thread {

    @Override
    public void run() {
        System.out.printf("%s: %tT%n", getName(), LocalTime.now());
    }

    static void main() {
        Exercicio01[] exercs = new Exercicio01[10];
        for (int i = 0; i < 10; i++) {
            exercs[i] = new Exercicio01();
        }
        for (int i = 0; i < 10; i++) {
            exercs[i].start();
        }
    }
}
