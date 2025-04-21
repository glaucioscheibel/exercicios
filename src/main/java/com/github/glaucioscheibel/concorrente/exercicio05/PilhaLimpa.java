package com.github.glaucioscheibel.concorrente.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class PilhaLimpa {
    private List<Integer> pilha = new ArrayList<>();

    public synchronized void poe(int prato) {
        pilha.add(prato);
    }
}
