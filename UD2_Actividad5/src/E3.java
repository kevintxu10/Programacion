import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir nombre y apellidos
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = sc.nextLine();

        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = sc.nextLine();



        // Tomar las tres primeras letras de cada uno (si tiene menos, usa lo que haya)
        String codigo = (nombre.length() >= 3 ? nombre.substring(0, 3) : nombre)
                + (apellido1.length() >= 3 ? apellido1.substring(0, 3) : apellido1)
                + (apellido2.length() >= 3 ? apellido2.substring(0, 3) : apellido2);

        // Convertir a mayúsculas
        codigo = codigo.toUpperCase();

        // Mostrar el resultado
        System.out.println("Tu código de usuario es: " + codigo);
    }
}