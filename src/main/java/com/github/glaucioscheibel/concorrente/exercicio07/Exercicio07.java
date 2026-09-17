package com.github.glaucioscheibel.concorrente.exercicio07;

public class Exercicio07 {
    public static final int TOTAL_PRATOS = 100;

    static void main() throws Exception {
        PilhaPratos sujos = new PilhaPratos("Sujos", TOTAL_PRATOS);
        PilhaPratos limpos = new PilhaPratos("Limpos", TOTAL_PRATOS);
        PilhaPratos escorredor = new PilhaPratos("Escorredor", 10, TOTAL_PRATOS);
        for (int i = 1; i <= TOTAL_PRATOS; i++) {
            sujos.colocarPrato(new Prato(i, Estado.SUJO));
        }
        System.out.printf("Pilha com %d pratos sujos: %s%n", sujos.getQuantidade(), sujos);
        System.out.printf("Pilha com %d pratos molhados: %s%n", escorredor.getQuantidade(), escorredor);
        System.out.printf("Pilha com %d pratos limpos: %s%n", limpos.getQuantidade(), limpos);
        Thread lava1 = Thread.ofVirtual().name("Lavador-1").start(new Lavador(sujos, escorredor));
        Thread enxuga1 = Thread.ofVirtual().name("Enxugador-1").start(new Enxugador(limpos, escorredor));
        Thread enxuga2 = Thread.ofVirtual().name("Enxugador-2").start(new Enxugador(limpos, escorredor));
        lava1.join();
        enxuga1.join();
        enxuga2.join();
        System.out.printf("Pilha com %d pratos sujos: %s%n", sujos.getQuantidade(), sujos);
        System.out.printf("Pilha com %d pratos molhados: %s%n", escorredor.getQuantidade(), escorredor);
        System.out.printf("Pilha com %d pratos limpos: %s%n", limpos.getQuantidade(), limpos);
    }
}
