import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir las dos cadenas
        System.out.print("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        // Comparar exactamente
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

        // Comparar ignorando mayúsculas y minúsculas
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales (sin distinguir mayúsculas/minúsculas).");
        } else {
            System.out.println("Las cadenas son diferentes (aunque no se distinga mayúsculas/minúsculas).");
        }
    }
}
