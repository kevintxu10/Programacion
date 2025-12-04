import java.time.LocalDate;
import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VideoDaw videoclub = null;

        int opcion;

        do {
            System.out.println("\n=== MENÚ VIDEODAW ===");
            System.out.println("1. Crear y registrar VideoClub");
            System.out.println("2. Registrar película");
            System.out.println("3. Registrar cliente");
            System.out.println("4. Alquilar película");
            System.out.println("5. Devolver película");
            System.out.println("6. Dar de baja cliente");
            System.out.println("7. Dar de baja película");
            System.out.println("8. Salir");
            System.out.print("Elige opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1 -> {
                    System.out.print("CIF: ");
                    String cif = sc.nextLine();
                    System.out.print("Dirección: ");
                    String dir = sc.nextLine();

                    videoclub = new VideoDaw(cif, dir);
                    System.out.println("VideoClub registrado correctamente.");
                }

                case 2 -> {

                    System.out.print("Código: ");
                    String cod = sc.nextLine();

                    System.out.print("Título: ");
                    String tit = sc.nextLine();

                    System.out.print("Género (ACCION, DRAMA, COMEDIA, INFANTIL, TERROR, SCIFI, SUSPENSE): ");
                    Genero g = Genero.valueOf(sc.nextLine().toUpperCase());

                    Pelicula p = new Pelicula(cod, tit, g);
                    videoclub.registrarPelicula(p);
                }

                case 3 -> {
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Num socio: ");
                    String ns = sc.nextLine();
                    System.out.print("Dirección: ");
                    String dir = sc.nextLine();
                    System.out.print("Fecha nacimiento (AAAA-MM-DD): ");
                    LocalDate fn = LocalDate.parse(sc.nextLine());

                    Cliente c = new Cliente(dni, nom, ns, dir, fn);
                    videoclub.registrarCliente(c);
                }

                case 4 -> {
                    System.out.print("Código película: ");
                    String cod = sc.nextLine();
                    System.out.print("DNI cliente: ");
                    String dni = sc.nextLine();

                    Pelicula p = videoclub.peliculasRegistradas.stream().filter(x -> x.getCod().equals(cod)).findFirst().orElse(null);
                    Cliente c = videoclub.clientesRegistrados.stream().filter(x -> x.getDni().equals(dni)).findFirst().orElse(null);

                    videoclub.alquilarPelicula(p, c);
                }

                case 5 -> {
                    System.out.print("Código película: ");
                    String cod = sc.nextLine();
                    System.out.print("DNI cliente: ");
                    String dni = sc.nextLine();

                    Pelicula p = videoclub.peliculasRegistradas.stream().filter(x -> x.getCod().equals(cod)).findFirst().orElse(null);
                    Cliente c = videoclub.clientesRegistrados.stream().filter(x -> x.getDni().equals(dni)).findFirst().orElse(null);

                    videoclub.devolverPelicula(p, c);
                }

                case 6 -> {
                    System.out.print("DNI cliente: ");
                    String dni = sc.nextLine();

                    Cliente c = videoclub.clientesRegistrados.stream().filter(x -> x.getDni().equals(dni)).findFirst().orElse(null);
                    videoclub.darBajaCliente(c);
                }

                case 7 -> {
                    System.out.print("Código película: ");
                    String cod = sc.nextLine();

                    Pelicula p = videoclub.peliculasRegistradas.stream().filter(x -> x.getCod().equals(cod)).findFirst().orElse(null);
                    videoclub.darBajaPelicula(p);
                }

                case 8 -> System.out.println("Saliendo...");
            }

        } while (opcion != 8);
    }
}


