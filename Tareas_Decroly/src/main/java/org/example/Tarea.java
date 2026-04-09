package org.example;

public class Tarea {
    private int id;
    private String descripcion;
    private String asignatura;

    public Tarea(int id, String descripcion, String asignatura) {
        this.id = id;
        this.descripcion = descripcion;
        this.asignatura = asignatura;
    }

    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public String getAsignatura() { return asignatura; }
}
