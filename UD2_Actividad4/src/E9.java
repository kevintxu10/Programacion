import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {

        int[] numeros = new int[100]; // Array de tamaño 100

        // Rellenar el array con valores enteros aleatorios entre 1 y 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (1 + Math.random() * 10);
        }

        // Pedir al usuario un valor N
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero N (entre 1 y 10): ");
        int N = sc.nextInt();

        // Mostrar en qué posiciones aparece N
        System.out.println("El número " + N + " aparece en las siguientes posiciones:");

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == N) {
                System.out.println("Posición: " + i);
                encontrado = true;
            }
        }

        // Si no se encuentra el número
        if (!encontrado) {
            System.out.println("El número " + N + " no aparece en el array.");
        }
    }
}
