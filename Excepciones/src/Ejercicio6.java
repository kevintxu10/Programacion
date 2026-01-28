import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();

        while (gatos.size() < 5) {
            try {
                System.out.print("Nombre del gato: ");
                String nombre = sc.next();

                System.out.print("Edad del gato: ");
                int edad = sc.nextInt();

                Gato g = new Gato(nombre, edad);
                gatos.add(g);
                System.out.println("Gato añadido correctamente");

            } catch (Exception e) {
                System.out.println("Error al crear el gato");
                e.printStackTrace();
                sc.nextLine(); // limpiar buffer
            }
        }

        System.out.println("\nListado de gatos:");
        for (Gato g : gatos) {
            g.imprimir();
        }
    }
}

