import java.util.Scanner;

public class MainMascotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion;

        do {
            System.out.println("\n--- TIENDA DE MASCOTAS ---");
            System.out.println("1. Insertar animal");
            System.out.println("2. Mostrar lista de animales");
            System.out.println("3. Mostrar datos de un animal");
            System.out.println("4. Mostrar todos los animales");
            System.out.println("5. Eliminar animal");
            System.out.println("6. Vaciar inventario");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Tipo (perro/gato/loro/canario): ");
                    String tipo = sc.nextLine().toLowerCase();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    switch (tipo) {
                        case "perro":
                            inventario.insertarAnimal(new Perro(nombre, edad));
                            break;
                        case "gato":
                            inventario.insertarAnimal(new Gato(nombre, edad));
                            break;
                        case "loro":
                            inventario.insertarAnimal(new Loro(nombre, edad));
                            break;
                        case "canario":
                            inventario.insertarAnimal(new Canario(nombre, edad));
                            break;
                        default:
                            System.out.println("Tipo incorrecto");
                    }
                    break;

                case 2:
                    inventario.mostrarLista();
                    break;

                case 3:
                    System.out.print("Nombre del animal: ");
                    inventario.mostrarAnimal(sc.nextLine());
                    break;

                case 4:
                    inventario.mostrarTodos();
                    break;

                case 5:
                    System.out.print("Nombre del animal a eliminar: ");
                    inventario.eliminarAnimal(sc.nextLine());
                    break;

                case 6:
                    inventario.vaciarInventario();
                    System.out.println("Inventario vaciado");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 0);

        sc.close();
    }
}

