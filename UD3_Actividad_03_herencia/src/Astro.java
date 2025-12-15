//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Astro {
    protected String nombre;
    protected double masa;
    protected double diametro;
    protected double periodoRotacion;
    protected double periodoTraslacion;
    protected double distanciaMedia;

    public Astro(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Periodo de rotación: " + periodoRotacion);
        System.out.println("Periodo de traslación: " + periodoTraslacion);
        System.out.println("Distancia media: " + distanciaMedia);
    }
}