package com.github.glaucioscheibel.concorrente.exercicio05;

public class Main {
    public static void main(String[] args) throws Exception {
        PilhaSuja sujos = new PilhaSuja(100);
        PilhaLimpa limpos = new PilhaLimpa();
        Escorredor escorredor = new Escorredor(10);
        Lavador lavador = new Lavador(sujos, escorredor);
        lavador.start();
        Enxugador enxugador1 = new Enxugador(escorredor, limpos);
        Enxugador enxugador2 = new Enxugador(escorredor, limpos);
        enxugador1.start();
        enxugador2.start();
    }
}
