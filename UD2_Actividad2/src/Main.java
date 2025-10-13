import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n Ejercicio 1");
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");

        edad = entrada.nextInt();
        if (edad >=18) {
            System.out.println("Eres mayor de edad");
        }

        System.out.println("\n Ejercicio 2");
        Scanner sc = new Scanner(System.in);
        int Edad;
        System.out.println("Ingrese su edad");

        Edad = sc.nextInt();
        if (Edad >=18) {
            System.out.println("Eres mayor de edad");
        } else if ( Edad <=17 && Edad >= 0) {
            System.out.println("Eres menor de edad");
        }
        else{
            System.out.println("La edad no tiene sentido");
        }

        System.out.println("\n Ejercicio 3");
         sc = new Scanner(System.in);
         for (int i = 1; i <= 20; i++) {
             System.out.println("Numero:" + i);
         }

        System.out.println("\n Ejercicio 4");
        sc = new Scanner(System.in);
        for (int i = 0; i <= 200; i +=2) {
            System.out.println("Numero:" + i);
        }

        System.out.println("\n Ejercicio 5");
        sc = new Scanner(System.in);
        for (int i = 2; i <= 200; i++)
            if(1 % 2 == 0){
            System.out.println("Numero:" + i);
        }

        System.out.println("\n Ejercicio 6");
        sc = new Scanner(System.in);
        int max;
        System.out.print("Introduce el numero:");
        max = sc.nextInt();
        for (int i = 1; i <= max; i++) {
            System.out.println("Numero:" + i);
        }


        System.out.println("\n Ejercicio 7");
        sc = new Scanner(System.in);
        int nota;
        System.out.println("Introduce tu calificacion entre el 0 y el 10");
        nota = sc.nextInt();
        if (nota <= 3) {
            System.out.println("Muy deficiente");
        } else if (nota <= 5) {
            System.out.println("Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota <= 10) {
            System.out.println("Sobresaliente");
        }

        System.out.println("\n Ejercicio 8");
        sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("Error: el número debe ser positivo.");
        } else {
            int factorial = 1;

            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + N + " es: " + factorial);

        }

        System.out.println("\n Ejercicio 9");
        sc = new Scanner(System.in);
        System.out.print("Introduce las horas: ");
        int horas = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();


        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos == 60) {
            minutos = 0;
            horas++;
        }

        if (horas == 24) {
            horas = 0;
        }

        System.out.printf("Dentro de un segundo serán:" + horas+":"+ minutos+":" +segundos);


        System.out.println("\n Ejercicio 10");
        sc = new Scanner(System.in);
        boolean negativo = false;
        System.out.println("Intoduce 10 numeros (no nulos)");
        for (int i = 1; i <=10; i++) {
            System.out.print("Numero" + i +":");
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("El numero no puede ser cero");
            } else if (numero <0) {
                negativo = true;
            }
            }
        if (negativo) {
            System.out.println("Si, se ha leido numeros negativo");
        }else {
            System.out.println("No, todos los numeros son positivos");
        }


        System.out.println("\n Ejercicio 11");
        sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduce 10 números (no pueden ser cero):");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            }
            if (numero<0){
                negativos++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);


        System.out.println("\n Ejercicio 12");
        sc = new Scanner(System.in);
        int posi = 0;
        int negat = 0;

        System.out.println("Introduce una secuencia de números (introduce 0 para terminar):");

        int numero;
        do {
            System.out.print("Número: ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negat++;
            }

        } while (numero != 0);


        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negat);

        System.out.println("\n Ejercicio 13");
        sc = new Scanner(System.in);
        int suma = 0;
        int multiplicacion = 1;

        for (int i = 1; i <= 10; i++) {
            suma += i;
            multiplicacion *= i;
        }

        System.out.println("La suma de los 10 primeros números naturales es: " + suma);
        System.out.println("El producto de los 10 primeros números naturales es: " + multiplicacion);


    }
}