import java.time.LocalDate;

public class Persona {

    protected String nombre;
    protected String dni;
    protected LocalDate fechaNacimiento;

    public Persona(String nombre, String dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
}


