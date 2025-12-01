//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Movimiento {
    private static int contadorID = 1;
    private int id;
    private String fecha;
    private String tipo;

    private double cantidad;

    public Movimiento(String fehca, String tipo, double cantidad) {
        this.id = contadorID++;
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void mostrarInfoMovimiento(){
        System.out.println("-------");
        System.out.println("ID:" + id);
        System.out.println("Fecha:" + fecha);
        System.out.println("Tipo" + tipo);
        System.out.println("Cantidad" + cantidad);
        System.out.println("-------");
    }
}