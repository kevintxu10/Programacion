import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Biblioteca {

    private static final String FICHERO = "Biblioteca.dat";
    private static List<Libro> biblioteca = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        cargarFichero();

        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    crearLibro();
                    break;
                case 2:
                    mostrarLibros();
                    break;
                case 3:
                    eliminarLibro();
                    break;
                case 4:
                    guardarFichero();
                    break;
                case 5:
                    guardarFichero();
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- BIBLIOTECA ---");
        System.out.println("1. Crear Libro");
        System.out.println("2. Mostrar Libros");
        System.out.println("3. Eliminar Libro por ISBN");
        System.out.println("4. Guardar");
        System.out.println("5. Guardar y Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void crearLibro() {
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();

        if (buscarLibro(isbn) != null) {
            System.out.println("Error: El ISBN ya existe.");
            return;
        }

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Fecha publicación (YYYY-MM-DD): ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());

        biblioteca.add(new Libro(isbn, titulo, autor, fecha));
        System.out.println("Libro añadido correctamente.");
    }

    private static void mostrarLibros() {
        if (biblioteca.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
    }

    private static void eliminarLibro() {
        System.out.print("Introduce ISBN a eliminar: ");
        String isbn = sc.nextLine();

        Libro libro = buscarLibro(isbn);

        if (libro != null) {
            biblioteca.remove(libro);
            System.out.println("Libro eliminado.");
        } else {
            System.out.println("No se encontró el libro.");
        }
    }

    private static Libro buscarLibro(String isbn) {
        for (Libro libro : biblioteca) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    private static void guardarFichero() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO))) {
            oos.writeObject(biblioteca);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }

    private static void cargarFichero() {
        File file = new File(FICHERO);

        if (!file.exists()) {
            System.out.println("No existe fichero previo. Se creará uno nuevo.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO))) {
            biblioteca = (List<Libro>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (EOFException e) {
            System.out.println("Fichero vacío.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el fichero: " + e.getMessage());
        }
    }
}
