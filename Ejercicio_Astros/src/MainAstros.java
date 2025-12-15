import java.util.ArrayList;
import java.util.Scanner;

public class MainAstros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Planeta> planetas = new ArrayList<>();


        Planeta tierra = new Planeta(
                "Tierra", 5.97e24, 12742,
                24, 365, 149.6e6
        );
        tierra.addSatelite(new Satelite(
                "Luna", 7.35e22, 3474,
                655, 27.3, 384400
        ));

        Planeta marte = new Planeta(
                "Marte", 6.39e23, 6779,
                24.6, 687, 227.9e6
        );
        marte.addSatelite(new Satelite(
                "Fobos", 1.06e16, 22.2,
                7.6, 0.3, 9376
        ));
        marte.addSatelite(new Satelite(
                "Deimos", 1.8e15, 12.6,
                30.3, 1.3, 23460
        ));

        planetas.add(tierra);
        planetas.add(marte);

        int opcion;
        do {
            System.out.println("\n--- SISTEMA SOLAR ---");
            System.out.println("1. Mostrar planetas");
            System.out.println("2. Mostrar información de un planeta");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    for (Planeta p : planetas) {
                        System.out.println("- " + p.getNombre());
                    }
                    break;

                case 2:
                    System.out.print("Nombre del planeta: ");
                    String nombre = sc.nextLine();
                    boolean encontrado = false;

                    for (Planeta p : planetas) {
                        if (p.getNombre().equalsIgnoreCase(nombre)) {
                            p.mostrarInfo();
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Planeta no encontrado");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 0);

        sc.close();
    }
}
