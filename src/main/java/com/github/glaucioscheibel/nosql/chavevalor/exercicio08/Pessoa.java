package com.github.glaucioscheibel.nosql.chavevalor.exercicio08;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private String apelido;
    private String nome;
    private String sobrenome;
    private String telefone;
    private int idade;

    public Pessoa() {}

    public Pessoa(String apelido, String nome, String sobrenome, String telefone, int idade) {
        this.apelido = apelido;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [apelido=" + apelido + ", nome=" + nome + ", sobrenome=" + sobrenome + ", telefone=" + telefone
                + ", idade=" + idade + "]";
    }
}
