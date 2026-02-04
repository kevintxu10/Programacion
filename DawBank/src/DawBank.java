import java.time.LocalDate;
import java.util.Scanner;

public class DawBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("===== BIENVENIDO A DAWBANK =====");

            System.out.print("IBAN: ");
            String iban = sc.nextLine();

            if (!validarIBAN(iban)) {
                throw new Exception("IBAN inválido");
            }

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("DNI: ");
            String dni = sc.nextLine();

            System.out.print("Fecha nacimiento (yyyy-mm-dd): ");
            LocalDate fecha = LocalDate.parse(sc.nextLine());

            System.out.print("Teléfono: ");
            String telefono = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Dirección: ");
            String direccion = sc.nextLine();

            Cliente cliente = new Cliente(nombre, dni, fecha, telefono, email, direccion);

            CuentaBancaria cuenta = new CuentaBancaria(iban, cliente);

            int opcion;

            do {
                System.out.println("\n1. Datos cuenta");
                System.out.println("2. Ingresar");
                System.out.println("3. Retirar");
                System.out.println("4. Movimientos");
                System.out.println("5. Salir");
                System.out.print("Opción: ");

                opcion = Integer.parseInt(sc.nextLine());

                try {
                    switch (opcion) {
                        case 1:
                            System.out.println(cliente);
                            System.out.println("IBAN: " + cuenta.getIban());
                            System.out.println("Saldo: " + cuenta.getSaldo());
                            break;

                        case 2:
                            System.out.print("Cantidad: ");
                            cuenta.ingresar(Double.parseDouble(sc.nextLine()));
                            break;
                            case 3:
                            System.out.print("Cantidad: ");
                            cuenta.retirar(Double.parseDouble(sc.nextLine()));
                            break;

                        case 4:
                            for (Movimiento m : cuenta.getMovimientos()) {
                                System.out.println(m);
                            }
                            break;
                    }
                } catch (AvisarHaciendaException e) {
                    System.out.println(e);
                    e.printStackTrace();
                } catch (CuentaException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }

            } while (opcion != 5);

        } catch (Exception e) {
            System.out.println("ERROR GENERAL");
            e.printStackTrace();
        }

        sc.close();
    }

    public static boolean validarIBAN(String iban) {
        return iban.matches("[A-Z]{2}\\d{22}");
    }
}

