package com.github.glaucioscheibel.nosql.documento.odm.model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Field;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Index;
import dev.morphia.annotations.IndexOptions;
import dev.morphia.annotations.Indexes;
import dev.morphia.annotations.Reference;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

@Entity
@Indexes(@Index(fields = @Field("name"), options = @IndexOptions(unique = true)))
public class Autor {
    @Id
    private ObjectId id;

    private String name;

    private List<Endereco> enderecos;

    @Reference
    private List<Livro> livros;

    public Autor() {}

    public Autor(String name) {
        this.name = name;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Endereco> getEnderecos() {
        return this.enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void addEndereco(Endereco endereco) {
        if (this.enderecos == null) {
            this.enderecos = new ArrayList<>();
        }
        this.enderecos.add(endereco);
    }

    public List<Livro> getLivros() {
        return this.livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void addLivro(Livro livro) {
        if (this.livros == null) {
            this.livros = new ArrayList<>();
        }
        this.livros.add(livro);
    }
}
