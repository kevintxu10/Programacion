import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ AGENDA ---");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Visualizar agenda");
            System.out.println("5. Número de contactos");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        if (!Contacto.validarNombre(nombre)) {
                            System.out.println("Nombre no válido.");
                            break;
                        }

                        System.out.print("Teléfono: ");
                        String telefono = sc.nextLine();

                        if (!Contacto.validarTelefono(telefono)) {
                            System.out.println("Teléfono no válido.");
                            break;
                        }

                        System.out.print("Correo: ");
                        String correo = sc.nextLine();

                        if (!Contacto.validarCorreo(correo)) {
                            System.out.println("Correo no válido.");
                            break;
                        }

                        agenda.anadeContacto(new Contacto(nombre, telefono, correo));
                        break;

                    case 2:
                        System.out.print("Nombre a buscar: ");
                        agenda.buscaContacto(sc.nextLine());
                        break;

                    case 3:
                        System.out.print("Nombre a eliminar: ");
                        agenda.eliminaContacto(sc.nextLine());
                        break;

                    case 4:
                        agenda.visualizaAgenda();
                        break;

                    case 5:
                        System.out.println("Número de contactos: " + agenda.numeroContactos());
                        break;

                    case 6:
                        System.out.println("Saliendo de la agenda...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número.");
            }

        } while (opcion != 6);

        sc.close();
    }
}

