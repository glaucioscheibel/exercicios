package com.github.glaucioscheibel.strings;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        String digitos;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe digitos: ");
        digitos = input.nextLine();
        boolean primeiro = true;
        for (char c : digitos.toCharArray()) {
            if (primeiro) {
                primeiro = false;
            } else {
                System.out.print(", ");
            }
            switch (c) {
                case '0':
                    System.out.print("zero");
                    break;
                case '1':
                    System.out.print("um");
                    break;
                case '2':
                    System.out.print("dois");
                    break;
                case '3':
                    System.out.print("três");
                    break;
                case '4':
                    System.out.print("quatro");
                    break;
                case '5':
                    System.out.print("cinco");
                    break;
                case '6':
                    System.out.print("seis");
                    break;
                case '7':
                    System.out.print("sete");
                    break;
                case '8':
                    System.out.print("oito");
                    break;
                case '9':
                    System.out.print("nove");
                    break;
            }
        }
        input.close();
    }
}
