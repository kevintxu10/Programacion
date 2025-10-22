import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; // Array de 10 enteros inicializado en 0
        char opcion;

        do {
            // Mostrar el menú
            System.out.println("\n--- MENÚ ---");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.next().toLowerCase().charAt(0); // leer la opción (a, b o c)

            switch (opcion) {
                case 'a':
                    // Mostrar todos los valores del array
                    System.out.println("\nContenido del array:");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Posición " + i + ": " + numeros[i]);
                    }
                    break;

                case 'b':
                    // Introducir valor en una posición
                    System.out.print("Introduce un valor entero: ");
                    int valor = sc.nextInt();

                    System.out.print("Introduce la posición (0 a 9): ");
                    int posicion = sc.nextInt();

                    // Validar que la posición esté dentro del rango
                    if (posicion >= 0 && posicion < numeros.length) {
                        numeros[posicion] = valor;
                        System.out.println("Valor guardado correctamente.");
                    } else {
                        System.out.println("Posición no válida. Debe estar entre 0 y 9.");
                    }
                    break;

                case 'c':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 'c'); // Repetir hasta que el usuario elija salir
    }
}
