package com.github.glaucioscheibel.concorrente.exercicio06;

public class Exercicio06 {
    public static void main(String[] args) throws Exception {
        PilhaPratos sujos = new PilhaPratos(100);
        PilhaPratos limpos = new PilhaPratos(100);
        PilhaPratos escorredor = new PilhaPratos(10);
        for (int i = 1; i <= 100; i++) {
            sujos.addPrato(new Prato(i, Estado.SUJO));
        }
        System.out.printf("Pilha com %d pratos sujos: %s\n", sujos.getQtde(), sujos);
        System.out.printf("Pilha com %d pratos limpos: %s\n", limpos.getQtde(), limpos);
        Lavador l1 = new Lavador(sujos, escorredor);
        Secador s1 = new Secador(limpos, escorredor);
        Secador s2 = new Secador(limpos, escorredor);
        Thread t1 = Thread.ofPlatform().name("Lavador-1").start(l1);
        Thread t2 = Thread.ofPlatform().name("Secador-1").start(s1);
        Thread t3 = Thread.ofPlatform().name("Secador-2").start(s2);
        t1.join();
        t2.join();
        t3.join();
        System.out.printf("Pilha com %d pratos sujos: %s\n", sujos.getQtde(), sujos);
        System.out.printf("Pilha com %d pratos limpos: %s\n", limpos.getQtde(), limpos);
    }
}
