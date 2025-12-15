import java.util.ArrayList;

public class Inventario {

    private ArrayList<Animal> animales;

    public Inventario() {
        animales = new ArrayList<>();
    }

    public void insertarAnimal(Animal a) {
        animales.add(a);
    }

    public void eliminarAnimal(String nombre) {
        animales.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
    }

    public void vaciarInventario() {
        animales.clear();
    }

    public void mostrarLista() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales en el inventario");
            return;
        }
        for (Animal a : animales) {
            System.out.println(a.getTipo() + " - " + a.getNombre());
        }
    }

    public void mostrarAnimal(String nombre) {
        for (Animal a : animales) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                a.mostrarDatos();
                return;
            }
        }
        System.out.println("Animal no encontrado");
    }

    public void mostrarTodos() {
        if (animales.isEmpty()) {
            System.out.println("Inventario vacío");
            return;
        }
        for (Animal a : animales) {
            a.mostrarDatos();
            System.out.println("--------------");
        }
    }
}

