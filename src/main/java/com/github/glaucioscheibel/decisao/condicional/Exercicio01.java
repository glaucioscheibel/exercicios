package com.github.glaucioscheibel.decisao.condicional;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        char estadoCivil;
        Scanner input = new Scanner(System.in);
        System.out.print("Inicial do estado civil: ");
        estadoCivil = input.nextLine().charAt(0);
        switch (estadoCivil) {
            case 'S':
                System.out.println("Solteiro");
                break;
            case 'C':
                System.out.println("Casado");
                break;
            case 'V':
                System.out.println("Viúvo");
                break;
            case 'D':
                System.out.println("Divorciado");
                break;
            case 'E':
                System.out.println("dEsquitado");
                break;
            default:
                System.err.println("Inicial inválida");
                break;
        }
    }
}
