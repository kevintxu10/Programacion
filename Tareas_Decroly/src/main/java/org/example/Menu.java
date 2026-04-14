package org.example;



import java.util.Scanner;

public class Menu {

    private TareaService service = new TareaService();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Ver tareas");
            System.out.println("2. Añadir tarea");
            System.out.println("3. Añadir tarea urgente");
            System.out.println("4. Completar tarea");
            System.out.println("5. Editar tarea");
            System.out.println("6. Eliminar tarea");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                opcion = -1;
            }

            switch (opcion) {

                case 1:
                    System.out.println("\nID | ASIGNATURA | DESCRIPCIÓN | ESTADO");
                    System.out.println("------------------------------------------------");

                    for (Tarea t : service.listarTareas()) {
                        String estado = t.isCompletada() ? "COMPLETADA" : "PENDIENTE";

                        System.out.println(
                                t.getId() + " | " +
                                        t.getAsignatura() + " | " +
                                        t.getDescripcion() + " | " +
                                        estado
                        );
                    }
                    break;

                case 2:
                    System.out.print("Asignatura: ");
                    String asig = sc.nextLine();

                    System.out.print("Descripción: ");
                    String desc = sc.nextLine();

                    service.crearTarea(desc, asig);
                    System.out.println("Tarea creada");
                    break;

                case 3:
                    System.out.print("Asignatura: ");
                    String asigU = sc.nextLine();

                    System.out.print("Descripción: ");
                    String descU = sc.nextLine();

                    System.out.print("Prioridad (1-5): ");
                    int prioridad = Integer.parseInt(sc.nextLine());

                    service.crearTarea(descU, asigU);

                    System.out.println("Tarea urgente creada. Prioridad: " + prioridad);
                    break;

                case 4:
                    System.out.print("ID de la tarea a completar: ");
                    int idComp = Integer.parseInt(sc.nextLine());

                    service.completarTarea(idComp);
                    System.out.println("Tarea completada");
                    break;

                case 5:
                    System.out.print("ID: ");
                    int idEdit = Integer.parseInt(sc.nextLine());

                    System.out.print("Nueva asignatura: ");
                    String nuevaAsig = sc.nextLine();

                    System.out.print("Nueva descripción: ");
                    String nuevaDesc = sc.nextLine();

                    service.editarTarea(idEdit, nuevaDesc, nuevaAsig);
                    System.out.println("Tarea actualizada");
                    break;

                case 6:
                    System.out.print("ID de la tarea a eliminar: ");
                    int idDel = Integer.parseInt(sc.nextLine());

                    service.eliminarTarea(idDel);
                    System.out.println("Tarea eliminada");
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 7);

        sc.close();
    }
}
