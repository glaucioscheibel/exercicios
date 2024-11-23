package com.github.glaucioscheibel.funcoes;

import java.util.Scanner;

public class Exercicio03 {
    public static double toCelcius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe uma temperatura em celcius: ");
        temp = input.nextDouble();
        double f = toFahrenheit(temp);
        double c = toCelcius(f);
        System.out.printf("A temperatura %1.2f é %1.2fF e %1.2fC\n", temp, f, c);
        input.close();
    }
}
