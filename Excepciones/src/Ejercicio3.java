import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] valores = new double[5];
        int i = 0;

        while (i < valores.length) {
            try {
                System.out.print("Introduce un valor double: ");
                valores[i] = sc.nextDouble();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto, inténtalo de nuevo");
                e.printStackTrace();
                sc.next();
            }
        }

        System.out.println("Vector completo:");
        for (double v : valores) {
            System.out.println(v);
        }
    }
}

