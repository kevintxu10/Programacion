import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainArraylist {

    public static void main(String[] args) {

        // 1. Crear 5 productos
        Producto p1 = new Producto("Sandia", 10);
        Producto p2 = new Producto("Pera", 5);
        Producto p3 = new Producto("Melocoton", 8);
        Producto p4 = new Producto("Plátano", 12);
        Producto p5 = new Producto("Melon", 6);

        // 2. Crear ArrayList
        ArrayList<Producto> lista = new ArrayList<>();

        // 3. Añadir productos
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        // 4. Mostrar con Iterator
        System.out.println("Contenido inicial del ArrayList:");
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 5. Eliminar dos elementos
        lista.remove(p1);
        lista.remove(p4);

        // 6. Insertar un nuevo producto en medio
        Producto nuevo = new Producto("Fresa", 20);
        lista.add(lista.size() / 2, nuevo);

        // 7. Mostrar de nuevo con Iterator
        System.out.println("\nDespués de eliminar e insertar:");
        it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 8. Ordenar la lista por nombre
        Collections.sort(lista);

        System.out.println("\nLista ordenada por nombre:");
        Iterator<Producto> itOrdenado = lista.iterator();
        while (itOrdenado.hasNext()) {
            System.out.println(itOrdenado.next());
        }


        // 9. Eliminar todos los valores
        lista.clear();
        System.out.println("\nArrayList vacío. Tamaño: " + lista.size());
    }
}
