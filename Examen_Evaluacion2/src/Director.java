import java.time.LocalDate;

public class Director extends Trabajador{
    private String Telefono;
    private String CocheEmpresa;


    public Director(String nombre, LocalDate FechaNacimiento, String DNI, String direccion) {
        super(nombre, FechaNacimiento, DNI, direccion);
        this.Telefono = Telefono;
        this.CocheEmpresa = CocheEmpresa;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCocheEmpresa() {
        return CocheEmpresa;
    }

    @Override
    public String toString() {
        return "Director{" +
                "Telefono='" + Telefono + '\'' +
                ", CocheEmpresa='" + CocheEmpresa + '\'' +
                '}';
    }
}
