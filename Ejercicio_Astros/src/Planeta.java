import java.util.ArrayList;

public class Planeta extends Astro {
    private ArrayList<Satelite> satelites;

    public Planeta(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {

        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.satelites = new ArrayList<>();
    }

    public void addSatelite(Satelite s) {
        satelites.add(s);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Satélites:");
        if (satelites.isEmpty()) {
            System.out.println("  No tiene satélites");
        } else {
            for (Satelite s : satelites) {
                System.out.println("  - " + s.nombre);
            }
        }
    }
}
