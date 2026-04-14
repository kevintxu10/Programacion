package org.example;

public class TareaUrgente extends Tarea {

    private int prioridad;

    public TareaUrgente(int id, String descripcion, String asignatura, boolean completada, int prioridad) {
        super(id, descripcion, asignatura, completada);
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
