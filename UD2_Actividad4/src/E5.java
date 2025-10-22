import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {

        System.out.println("\nEjercicio 5");
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[20];
        double suma = 0;

        // Pedimos los 20 números reales
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número real " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        // Calculamos la media
        double media = suma / numeros.length;

        // Mostramos el resultado
        System.out.println("\nLa media de los valores introducidos es: " + media);

    }
}
