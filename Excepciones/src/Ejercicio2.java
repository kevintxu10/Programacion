import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce A: ");
            int A = sc.nextInt();

            System.out.print("Introduce B: ");
            int B = sc.nextInt();

            int resultado = A / B;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir números enteros");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Error: división por cero");
            e.printStackTrace();
        }
    }
}

