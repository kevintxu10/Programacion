import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Gestion {
    String opcion = "7";

    File carpeta = new File("./src/resources/");

    {
        File[] ficheros = carpeta.listFiles((dir, name) -> name.endsWith(".dat"));
        if (ficheros != null) for (File fichero : ficheros)
            try {
                GerenteDep c = MyUtils.leerGerenteDep(fichero.getPath());
                String nombre = fichero.getName().replace(".dat", "");
                Gestion.put(nombre, c);
            } catch (Exception e) {
                System.err.println("Error al cargar " + fichero.getName());
            }
    }

    private static void put(String nombre, GerenteDep c) {
    }

    //menu
            do

    {
        System.out.println("1. Registrar trabajador en empresa.\n" +
                "2. Mostrar informacion general.\n" +
                "3. Mostrar numero de trabajadores.\n" +
                "4. Mostrar informacion de departamento.\n" +
                "5. Eliminar Trabajador.\n" +
                "6. Guardar Informacion.\n" +
                "7. Guardar y salir.");
        Scanner sc;
        opcion = sc.nextLine();


        switch (opcion) {
            case "1":
                String opcion10 = "";

                String opcion11 = "";


                do {
                    String titulo;

                    boolean registrado1 = false;
                    boolean registrado2 = false;
                    boolean registrado3 = false;

                    System.out.println("-----REGISTRAR-----");
                    System.out.println("1. Registrar Director");
                    System.out.println("2. Registrar Gerente");
                    System.out.println("3. Registrar Trabajador normal");

                    opcion11 = sc.nextLine();
                    if (opcion11.equalsIgnoreCase("1")) {
                        do {
                            System.out.println("Nombre del Director");
                            titulo = sc.nextLine().trim();
                        } while (titulo.isBlank());
                    } else if (opcion11.equalsIgnoreCase("2")) {

                        do {
                            System.out.println("Nombre Gerente");
                            titulo = sc.nextLine().trim();
                        } while (titulo.isBlank());
                    }
                    break;
                }