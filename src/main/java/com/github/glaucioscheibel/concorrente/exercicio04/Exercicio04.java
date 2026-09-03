package com.github.glaucioscheibel.concorrente.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {
    void main() {
        List<Integer> numeros = new ArrayList<>();
        Thread.ofPlatform().start(new Insere(numeros));
        Thread.ofPlatform().start(new Insere(numeros));
        Thread.ofPlatform().start(new Remove(numeros));
        Thread.ofPlatform().start(new Imprime(numeros));
    }
}
