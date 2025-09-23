package com.github.glaucioscheibel.concorrente.exercicio06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Prato> sujos = new ArrayList<>();
        List<Prato> limpos = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            sujos.add(new Prato(i, Estado.SUJO));
        }
        System.out.printf("Pilha suja: %s\n", sujos);
        System.out.printf("Pilha limpa: %s\n", limpos);
        Escorredor escorredor = new Escorredor();
        Lavador l1 = new Lavador(sujos, escorredor);
        Secador s1 = new Secador(limpos, escorredor);
        Secador s2 = new Secador(limpos, escorredor);
        Thread t1 = Thread.ofVirtual().start(l1);
        Thread t2 = Thread.ofVirtual().start(s1);
        Thread t3 = Thread.ofVirtual().start(s2);
        t1.join();
        t2.join();
        t3.join();
        System.out.printf("Pilha suja: %s\n", sujos);
        System.out.printf("Pilha limpa: %s\n", limpos);
    }
}
