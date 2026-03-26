import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate FechaNacimiento;
    private String DNI;
    private String direccion;

    public Persona(String nombre, LocalDate FechaNacimiento, String DNI, String direccion ){
        this.nombre = nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.DNI = DNI;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", FechaNacimiento=" + FechaNacimiento +
                ", DNI='" + DNI + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
