package com.github.glaucioscheibel.nosql.chavevalor.exercicio07;

public interface PessoaDAO {
    void create(Pessoa pessoa);

    void update(Pessoa pessoa);

    Pessoa read(int id);

    void delete(int id);
}
