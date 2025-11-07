import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] array3 =   new int [10];

        String opcion = "c";

        int contadorPosicion = 0;
        do{
            System.out.println("Escoja la opcion deseada: ");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Insertar posicion y valor: ");
            System.out.println("c. Salir");
            opcion = sc.nextLine();


            switch (opcion) {
                case "a":
                    System.out.println(Arrays.toString(array3));
                    break;

                case "b":
                    sc = new Scanner(System.in);
                    System.out.println("Introduce la posicion donde quieras insertar el valor: ");
                    contadorPosicion = sc.nextInt();
                    if(contadorPosicion < array3.length && contadorPosicion >= 0){
                        array3[contadorPosicion] = sc.nextInt();

                    }
                    else{
                        System.out.println("No se pueden insertar porque la posicion no coincide");
                    }
                    break;

                case "c":
                    System.out.println("El menu se cerrara");
                    break;

                default:
                    System.out.println("Por favor escoja una opcion correcta");

            }

        }while(!opcion.equals("c")); //opcion.equals("c") == false

    }
}