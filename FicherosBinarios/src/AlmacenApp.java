import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AlmacenApp {

    private static final String FICHERO = "Almacen.dat";
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        cargarFichero();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ALMACÉN ---");
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Eliminar producto por código");
            System.out.println("4. Guardar productos en fichero");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> crearProducto();
                case 2 -> mostrarProductos();
                case 3 -> eliminarProducto();
                case 4 -> guardarFichero();
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 5);
    }

    private static void crearProducto() {
        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        productos.add(new Producto(codigo, nombre, cantidad, precio));
        System.out.println("Producto añadido correctamente");
    }

    private static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el almacén");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    private static void eliminarProducto() {
        System.out.print("Código del producto a eliminar: ");
        String codigo = sc.nextLine();

        boolean eliminado = productos.removeIf(
                p -> p.getCodigo().equalsIgnoreCase(codigo)
        );

        if (eliminado) {
            System.out.println("Producto eliminado");
        } else {
            System.out.println("No se encontró el producto");
        }
    }

    private static void guardarFichero() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FICHERO))) {

            oos.writeObject(productos);
            System.out.println("Productos guardados correctamente");

        } catch (IOException e) {
            System.out.println("Error al guardar el fichero");
        }
    }

    @SuppressWarnings("unchecked")
    private static void cargarFichero() {
        File f = new File(FICHERO);

        if (!f.exists()) {
            return;
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FICHERO))) {

            productos = (ArrayList<Producto>) ois.readObject();
            System.out.println("Datos cargados del fichero");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el fichero");
        }
    }
}



