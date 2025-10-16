import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1");
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
        int cantidad = sc.nextInt();


        if (cantidad % 5 != 0) {
            System.out.println("La cantidad debe ser un múltiplo de 5.");
            return;
        }


        int[] billetes = {500, 200, 100, 50, 20, 10, 5};

        System.out.println("\nDesglose mínimo de billetes para " + cantidad + " €:");

        for (int billete : billetes) {
            int numBilletes = cantidad / billete;
            if (numBilletes > 0) {
                System.out.println(numBilletes + " billete(s) de " + billete + " €");
                cantidad = cantidad % billete;
            }
        }

        System.out.println("Ejercicio 2");
        sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            // Mostrar menú
            System.out.println("\n MENÚ DE OPCIONES");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.print("Introduce el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    System.out.print("Introduce el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    System.out.print("Introduce el dividendo: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el divisor: ");
                    num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir entre 0.");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }
}