import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {

        double[] numeros = new double[100]; // Array con 100 números reales

        // Llenar el array con números aleatorios entre 0.0 y 1.0
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }

        // Pedir al usuario un valor real R
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un valor real R (entre 0.0 y 1.0): ");
        double R = sc.nextDouble();

        // Contar cuántos valores son mayores o iguales a R
        int contador = 0;
        for (double n : numeros) {
            if (n >= R) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("Hay " + contador + " valores mayores o iguales a " + R + ".");
    }
}