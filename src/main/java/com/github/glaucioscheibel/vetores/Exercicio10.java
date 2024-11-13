package com.github.glaucioscheibel.vetores;

public class Exercicio10 {
    public static void main(String[] args) {
        float[] notas = {9.9f, 9.7f, 9.8f, 10f, 10f};
        float maior = notas[0];
        float menor = notas[0];
        float soma = 0f;
        float media;
        for (float nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
            soma += nota;
        }
        media = (soma - maior - menor) / 3f;
        System.out.printf("Média: %1.2f desconsiderando as notas %1.2f e %1.2f", media, menor, maior);
    }
}
