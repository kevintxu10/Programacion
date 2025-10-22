import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Pedimos cuántas personas hay
        System.out.print("¿Cuántas personas quieres introducir? ");
        int N = sc.nextInt();

        // Creamos un array para guardar las alturas
        double[] alturas = new double[N];

        // Pedimos las alturas una por una
        for (int i = 0; i < N; i++) {
            System.out.print("Introduce la altura de la persona " + (i + 1) + " (en metros): ");
            alturas[i] = sc.nextDouble();
        }

        // Calculamos la suma de todas las alturas
        double suma = 0;
        for (int i = 0; i < N; i++) {
            suma += alturas[i];
        }

        // Calculamos la media
        double media = suma / N;

        // Buscamos la altura máxima y mínima
        double max = alturas[0];
        double min = alturas[0];
        for (int i = 0; i < N; i++) {
            if (alturas[i] > max) {
                max = alturas[i];
            }
            if (alturas[i] < min) {
                min = alturas[i];
            }
        }

        // Contamos cuántas personas están por encima o por debajo de la media
        int porEncima = 0;
        int porDebajo = 0;

        for (int i = 0; i < N; i++) {
            if (alturas[i] > media) {
                porEncima++;
            } else if (alturas[i] < media) {
                porDebajo++;
            }
        }

        // Mostramos los resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Altura media: " + media + " metros");
        System.out.println("Altura máxima: " + max + " metros");
        System.out.println("Altura mínima: " + min + " metros");
        System.out.println("Personas por encima de la media: " + porEncima);
        System.out.println("Personas por debajo de la media: " + porDebajo);
    }
}
