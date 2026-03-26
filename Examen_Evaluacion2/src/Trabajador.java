import java.time.LocalDate;

public class Trabajador extends Persona {
    private String NumeroSS;
    private String Email;
    private String Salario;
    private String Departamento;


    public Trabajador(String nombre, LocalDate FechaNacimiento, String DNI, String direccion, String NumeroSS, String Email, String Salario, String Departamento) {
        super(nombre, FechaNacimiento, DNI, direccion);
        this.NumeroSS = NumeroSS;
        this.Email = Email;
        this.Salario = Salario;
        this.Departamento = Departamento;
    }

    public Trabajador(String nombre, LocalDate FechaNacimiento, String DNI, String direccion) {
        super(nombre, FechaNacimiento, DNI, direccion);
        this.NumeroSS = NumeroSS;
        this.Email = Email;
        this.Salario = Salario;
        this.Departamento = Departamento;
    }

    public static boolean add(Trabajador c) {
        return false;
    }

    public String getNumeroSS() {
        return NumeroSS;
    }

    public String getEmail() {
        return Email;
    }

    public String getSalario() {
        return Salario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "NumeroSS='" + NumeroSS + '\'' +
                ", Email='" + Email + '\'' +
                ", Salario='" + Salario + '\'' +
                ", Departamento='" + Departamento + '\'' +
                '}';
    }

    public Trabajador getDni() {
        return null;
    }
}
