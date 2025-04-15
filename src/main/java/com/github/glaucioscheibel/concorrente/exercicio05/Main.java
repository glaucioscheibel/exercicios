package com.github.glaucioscheibel.concorrente.exercicio05;

public class Main {
    public static void main(String[] args) throws Exception {
        PilhaSuja pilhaSuja = new PilhaSuja(100);
        PilhaSeca pilhaSeca = new PilhaSeca();
        Escorredor escorredor = new Escorredor();
        Lavador lavador1 = new Lavador(pilhaSuja, escorredor);
        Enxugador enxugador1 = new Enxugador(escorredor, pilhaSeca);
        Enxugador enxugador2 = new Enxugador(escorredor, pilhaSeca);
        lavador1.start();
        enxugador1.start();
        enxugador2.start();
        lavador1.join();
        enxugador1.join();
        enxugador2.join();
        System.out.println(pilhaSeca);
    }
}
