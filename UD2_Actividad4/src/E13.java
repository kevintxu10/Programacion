import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Introduce el valor inicial (V): ");
        int V = sc.nextInt();

        System.out.print("Introduce el incremento (I): ");
        int I = sc.nextInt();

        System.out.print("Introduce la cantidad de valores (N): ");
        int N = sc.nextInt();

        // Crear el array para almacenar la secuencia
        int[] secuencia = new int[N];

        // Rellenar el array con la secuencia aritmética
        for (int i = 0; i < N; i++) {
            secuencia[i] = V + (i * I);
        }

        // Mostrar la secuencia
        System.out.println("\n--- Secuencia aritmética ---");
        for (int i = 0; i < N; i++) {
            System.out.print(secuencia[i] + " ");
        }
    }
}
