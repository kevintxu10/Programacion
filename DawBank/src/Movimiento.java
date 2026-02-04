import java.time.LocalDateTime;

public class Movimiento {
    private static int contadorID = 1;
    private int id;
    private LocalDateTime fechaHora;
    private String tipo;
    private double cantidad;

    public Movimiento(String tipo, double cantidad) {
        this.id = contadorID++;
        this.fechaHora = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Fecha: " + fechaHora +
                " | Tipo: " + tipo +
                " | Cantidad: " + cantidad;
    }
}
