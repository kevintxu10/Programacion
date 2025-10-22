import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        System.out.println("\nEjercicio 4");
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        // Pedimos los 20 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número entero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            // Sumamos según el signo
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
        }

        // Mostramos resultados
        System.out.println("\nSuma de valores positivos: " + sumaPositivos);
        System.out.println("Suma de valores negativos: " + sumaNegativos);

    }
}



