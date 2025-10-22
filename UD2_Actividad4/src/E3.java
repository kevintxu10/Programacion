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

        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;

        for(int i = 1; i < numeros.length; i++){
            maximo = Math.max(numeros[i], maximo);
            minimo = Math.min(numeros[i], minimo);
                                                    // Se puede hacer de las dos formas
            if (numeros[1] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("El numero maximo es:" + maximo);
        System.out.println("El numero minimo es:" + minimo);


    }
}
