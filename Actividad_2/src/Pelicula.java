import java.time.LocalDate;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pelicula {
    private String cod;
    private String titulo;
    private Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;



    public Pelicula(String cod, String titulo, Genero genero) {
        this.cod = cod;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = LocalDate.now();
        this.isAlquilada = false;
    }


    public String getCod() { return cod; }
    public boolean getIsAlquilada() { return isAlquilada; }
    public void setIsAlquilada(boolean b) { this.isAlquilada = b; }
    public void setFechaAlquiler(LocalDateTime t) { this.fechaAlquiler = t; }
    public LocalDateTime getFechaAlquiler() { return fechaAlquiler; }
    public void setFechaBaja(LocalDate d) { this.fechaBaja = d; }
    public String getTitulo() {return titulo;}


    public void mostrarInfoPelicula() {
        System.out.println("--- Info Película ---");
        System.out.println("Código: " + cod);
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Registrada: " + fechaRegistro);
        System.out.println("Fecha Baja: " + fechaBaja);
        System.out.println("Alquilada: " + (isAlquilada ? "Sí" : "No"));
        if (isAlquilada) System.out.println("Fecha Alquiler: " + fechaAlquiler);
        System.out.println();
    }
}
