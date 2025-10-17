import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {

        System.out.println("\nEjercicio 2");

        Scanner sc = new Scanner(System.in);
        double suma = 0;

        double[] numeros = new double[10]; // Array para guardar los 10 números

        // Pedir los números al usuario
        System.out.println("Introduce 10 números reales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        // Calcular la suma
        for (double num : numeros) {
            suma += num;
        }

        // Mostrar el resultado
        System.out.println("\nLa suma de todos los números es: " + suma);
    }
}