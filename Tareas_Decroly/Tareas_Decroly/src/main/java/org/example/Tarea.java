package org.example;

public class Tarea extends Elemento {

    private String asignatura;
    private boolean completada;

    public Tarea(int id, String descripcion, String asignatura, boolean completada) {
        super(id, descripcion); //  llamada a la clase padre
        this.asignatura = asignatura;
        this.completada = completada;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public boolean isCompletada() {
        return completada;
    }
}