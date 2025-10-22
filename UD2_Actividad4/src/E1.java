import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {

        System.out.println("\nEjercicio 1");

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10]; // Array para guardar los 10 números

        // Pedir los números al usuario
        System.out.println("Introduce 10 números reales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        // Mostrar los números introducidos
        System.out.println("\nLos números introducidos son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }



    }
}