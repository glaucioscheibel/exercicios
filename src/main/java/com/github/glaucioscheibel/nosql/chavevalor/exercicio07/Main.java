package com.github.glaucioscheibel.nosql.chavevalor.exercicio07;

import java.util.Scanner;

public class Main {
    private static Scanner input;
    private static PessoaDAO dao = new PessoaDAO();

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("""
                    Menu:
                    1 - Create
                    2 - Read
                    3 - Update
                    4 - Delete
                    0 - Fim
                    """);
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    break;
                case 4:
                    delete();
                    break;
            }
        } while (opcao != 0);
        input.close();
    }

    private static void create() {
        Pessoa p = new Pessoa();
        System.out.println("Create:");
        System.out.print("Apelido: ");
        p.setApelido(input.nextLine());
        System.out.print("Nome: ");
        p.setNome(input.nextLine());
        System.out.print("Sobrenome: ");
        p.setSobrenome(input.nextLine());
        System.out.print("Telefone: ");
        p.setTelefone(input.nextLine());
        System.out.print("Idade: ");
        p.setIdade(input.nextInt());
        input.nextLine();
        dao.create(p);
    }

    private static void read() {
        System.out.println("Read:");
        System.out.print("Apelido: ");
        String apelido = input.nextLine();
        System.out.println(dao.read(apelido));
    }

    private static void delete() {
        System.out.println("Delete:");
        System.out.print("Apelido: ");
        String apelido = input.nextLine();
        dao.delete(apelido);
    }
}
