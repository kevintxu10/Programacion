import java.util.Arrays;
import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Pedimos los valores N y M
        System.out.print("Introduce el tamaño del array (N): ");
        int N = sc.nextInt();

        System.out.print("Introduce el valor que se almacenará en todas las posiciones (M): ");
        int M = sc.nextInt();

        // Creamos el array de tamaño N
        int[] array = new int[N];

        // Asignamos M a todas las posiciones
        Arrays.fill(array, M);

        // Mostramos el contenido del array
        System.out.println("\nContenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
}