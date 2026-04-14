package org.example;



import java.util.List;

public class TareaService {

    private TareaDao dao = new TareaDao();

    public void crearTarea(String descripcion, String asignatura) {
        if (descripcion.isEmpty() || asignatura.isEmpty()) {
            System.out.println("Error: datos vacíos");
            return;
        }

        Tarea tarea = new Tarea(0, descripcion, asignatura, false);
        dao.insertar(tarea);
    }

    public List<Tarea> listarTareas() {
        return dao.obtenerTodas();
    }

    public void completarTarea(int id) {
        dao.marcarCompletada(id);
    }

    public void editarTarea(int id, String desc, String asig) {
        dao.actualizar(id, desc, asig);
    }

    public void eliminarTarea(int id) {
        dao.eliminar(id);
    }
}
