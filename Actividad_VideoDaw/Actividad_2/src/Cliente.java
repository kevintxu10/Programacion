import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String dni;
    private String nombre;
    private String numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private ArrayList<Pelicula> peliculasAlquiladas;


    public Cliente(String dni, String nombre, String numSocio, String direccion, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.peliculasAlquiladas = new ArrayList<>();
    }


    public String getDni() { return dni; }
    public String getNumSocio() { return numSocio; }
    public ArrayList<Pelicula> getPeliculasAlquiladas() { return peliculasAlquiladas; }


    public void addPelicula(Pelicula p) { peliculasAlquiladas.add(p); }
    public void removePelicula(Pelicula p) { peliculasAlquiladas.remove(p); }


    public void setFechaBaja(LocalDate d) { this.fechaBaja = d; }


    public void mostrarInfoCliente() {
        System.out.println("--- Información Cliente ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Nº Socio: " + numSocio);
        System.out.println("Dirección: " + direccion);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento);
        System.out.println("Fecha Baja: " + fechaBaja);
        System.out.println("Películas alquiladas: " + peliculasAlquiladas.size());
    }


    public void mostrarPeliculasAlquiladas() {
        System.out.println("--- Películas alquiladas ---");
        for (Pelicula p : peliculasAlquiladas) {
            System.out.println(p.getCod());
        }
    }
}

