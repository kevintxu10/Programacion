package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionTareas gestion = new GestionTareas();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- GESTOR DE TAREAS POR ASIGNATURA ---");
            System.out.println("1. Ver tareas pendientes");
            System.out.println("2. Añadir nueva tarea");
            System.out.println("3. Eliminar tarea terminada");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\nID | ASIGNATURA | DESCRIPCIÓN");
                    System.out.println("---------------------------------");
                    for (Tarea t : gestion.obtenerTodas()) {
                        System.out.println(t.getId() + " | " + t.getAsignatura() + " | " + t.getDescripcion());
                    }
                    break;
                case 2:
                    System.out.print("Asignatura (ej: Programación, BBDD): ");
                    String asig = sc.nextLine();
                    System.out.print("¿Qué tienes que hacer?: ");
                    String desc = sc.nextLine();
                    gestion.insertar(desc, asig);
                    System.out.println("¡Tarea anotada!");
                    break;
                case 3:
                    System.out.print("ID de la tarea a borrar: ");
                    int id = Integer.parseInt(sc.nextLine());
                    gestion.eliminar(id);
                    System.out.println("Tarea borrada.");
                    break;
                case 4:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
        sc.close();
    }
}







