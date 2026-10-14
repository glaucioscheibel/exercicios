package com.github.glaucioscheibel.nosql.chavevalor.exercicio09;

public interface PessoaDAO {
    void create(Pessoa pessoa);

    void update(Pessoa pessoa);

    Pessoa read(String apelido);

    void delete(String apelido);
}
