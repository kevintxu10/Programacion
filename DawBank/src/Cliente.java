public class Cliente extends Persona {

    private String telefono;
    private String email;
    private String direccion;

    public Cliente(String nombre, String dni, java.time.LocalDate fechaNacimiento,
                   String telefono, String email, String direccion) {

        super(nombre, dni, fechaNacimiento);
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nDNI: " + dni +
                "\nFecha nacimiento: " + fechaNacimiento +
                "\nTeléfono: " + telefono +
                "\nEmail: " + email +
                "\nDirección: " + direccion;
    }
}


