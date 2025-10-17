import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        System.out.println("\nEjercicio 3");
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el numero" + (i + 1) + ":");
            numeros[i] = sc.nextDouble();
        }

        double maximo = numeros[0];
        double minimo = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if (numeros[1] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El numero maximo es:" + maximo);
        System.out.println("El numero minimo es:" + minimo);


    }
}
