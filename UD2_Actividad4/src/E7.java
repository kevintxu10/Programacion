import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor inicial (P): ");
        int P = sc.nextInt();

        System.out.print("Introduce el valor final (Q): ");
        int Q = sc.nextInt();

        // Validamos que P sea menor o igual que Q
        if (P > Q) {
            System.out.println("Error: P debe ser menor o igual que Q.");
        } else {
            int tamaño = Q - P + 1; // Cantidad de números entre P y Q (incluidos)
            int[] numeros = new int[tamaño];

            // Llenamos el array con los valores desde P hasta Q
            for (int i = 0; i < tamaño; i++) {
                numeros[i] = P + i;
            }

            // Mostramos los valores del array
            System.out.println("\nValores desde " + P + " hasta " + Q + ":");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
