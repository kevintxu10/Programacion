import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Bienvenido a DawBank =====");

        // Crear cuenta bancaria
        System.out.print("Introduce el IBAN: ");
        String iban = sc.nextLine();

        while (!validarIBAN(iban)) {
            System.out.println("IBAN inválido. Debe tener 2 letras + 22 números.");
            System.out.print("Introduce el IBAN: ");
            iban = sc.nextLine();
        }

        System.out.print("Introduce el titular: ");
        String titular = sc.nextLine();

        // Crear la cuenta
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);

        int opcion;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("IBAN: " + cuenta.getIban());
                    System.out.println("Titular: " + cuenta.getTitular());
                    System.out.println("Saldo: " + cuenta.getSaldo() + "€");
                    break;

                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;

                case 3:
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;

                case 4:
                    System.out.println("Saldo: " + cuenta.getSaldo() + "€");
                    break;

                case 5:
                    System.out.print("Cantidad a ingresar: ");
                    double cantidadIng = Double.parseDouble(sc.nextLine());
                    System.out.print("Fecha (dd/mm/aaaa): ");
                    String fechaIng = sc.nextLine();
                    cuenta.ingresar(cantidadIng, fechaIng);
                    break;

                case 6:
                    System.out.print("Cantidad a retirar: ");
                    double cantidadRet = Double.parseDouble(sc.nextLine());
                    System.out.print("Fecha (dd/mm/aaaa): ");
                    String fechaRet = sc.nextLine();
                    cuenta.retirar(cantidadRet, fechaRet);
                    break;

                case 7:
                    cuenta.mostrarMovimientos();
                    break;

                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 8);

        sc.close();
    }


    // ---------------------------
    //  VALIDACIÓN DE IBAN
    // ---------------------------
    public static boolean validarIBAN(String iban) {
        if (iban.length() != 24) return false;

        String letras = iban.substring(0, 2);
        String numeros = iban.substring(2);

        return letras.matches("[A-Z]{2}") && numeros.matches("\\d{22}");
    }
}
