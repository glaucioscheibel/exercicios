package com.github.glaucioscheibel.nosql.documento.odm.model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import java.util.Objects;
import org.bson.types.ObjectId;

@Entity
public class Livro {
    @Id
    private ObjectId id;

    private String titulo;

    private int ano;

    private double preco;

    public Livro() {}

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Livro other = (Livro) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + ", ano=" + ano + ", preco=" + preco + "]";
    }
}
