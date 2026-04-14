package org.example;

public class Elemento {

    protected int id;
    protected String descripcion;

    public Elemento(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
