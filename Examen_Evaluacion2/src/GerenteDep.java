import java.time.LocalDate;

public class GerenteDep extends Trabajador{

    private String NumTrabajadores;
    private String Gerencia;
    public String ColeccionTrabajador;


    public GerenteDep(String nombre, LocalDate FechaNacimiento, String DNI, String direccion, String NumeroSS, String Email, String Salario, String Departamento) {
        super(nombre, FechaNacimiento, DNI, direccion, NumeroSS, Email, Salario, Departamento);
        this.NumTrabajadores = NumTrabajadores;
        this.Gerencia = Gerencia;
        this.ColeccionTrabajador = ColeccionTrabajador;
    }

    public String getNumTrabajadores() {
        return NumTrabajadores;
    }

    public String getGerencia() {
        return Gerencia;
    }

    public String getColeccionTrabajador() {
        return ColeccionTrabajador;
    }


    //MOSTRAR INFO GerenteDep
    public String GerenteDep(){
        String info = String.format("\n%s\nDNI- %s\nNombre- %s\n%s\n",
                this.NumTrabajadores, this.Gerencia, this.ColeccionTrabajador;
        return info;
    }


    @Override
    public String toString() {
        return "GerenteDep{" +
                "NumTrabajadores='" + NumTrabajadores + '\'' +
                ", Gerencia='" + Gerencia + '\'' +
                ", ColeccionTrabajador='" + ColeccionTrabajador + '\'' +
                '}';
    }
}
