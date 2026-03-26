import java.time.LocalDate;

public class Empresa {
    private String nombre;
    private String CIF;
    private LocalDate Fecha;
    private String Coleccion;

    public Empresa(String nombre, String CIF, LocalDate fecha) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.Fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public String getColeccion() {
        return Coleccion;
    }


    //REGISTRAR TRABAJADOR
    public boolean registrarTrabajador(Trabajador c) {
        boolean creado = false;

        if (!registrarTrabajador(c.getDni())) {
            creado = Trabajador.add(c);
        }
        return creado;
    }

    //REGISTRAR TRABAJADOR
    public boolean registrarDirector(Trabajador c) {
        boolean creado = false;

        if (!registrarDirector(c.getDni())) {
            creado = Trabajador.add(c);
        }
        return creado;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", CIF='" + CIF + '\'' +
                ", Fecha=" + Fecha +
                ", Coleccion='" + Coleccion + '\'' +
                '}';
    }
}
