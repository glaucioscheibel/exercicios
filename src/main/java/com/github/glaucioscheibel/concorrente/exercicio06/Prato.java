package com.github.glaucioscheibel.concorrente.exercicio06;

public class Prato {
    private int id;
    private Estado estado;

    public Prato(int id, Estado estado) {
        this.id = id;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Prato{" + "id=" + id + ", estado=" + estado + '}';
    }
}
