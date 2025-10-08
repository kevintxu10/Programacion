import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Escribe un programa que dé los “buenos días”.
         System.out.println("Ejercicio 1");
         System.out.println ("Buenos dias");

        /*
        Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
         */

        System.out.println("Ejercicio 2");
        double lado = 5;
        double area = lado * lado;
        System.out.println("Lado:" + lado);
        System.out.println("area:" + area);

        /*
        Ejercicio 3: Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
         */

        System.out.println("\nEjercicio 3");
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el valor del lado del cuadrado");
        double lado2 = sc.nextDouble();

        double area2 = lado2 * lado2;
        System.out.println("Lado:" + lado2);
        System.out.println("area:" + area2);

        /*
        Ejercicio 4: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y division

         */

        System.out.println("\nEjercicio 4");
        sc = new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double numero2 = sc.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        System.out.println("suma:" + suma);
        System.out.println("resta:" + resta);
        System.out.println("multiplicacion:" + multiplicacion);
        System.out.println("division:" + division);

        /*
        Ejercicio 5:Escribe un programa que toma como dato de entrada un número que corresponde a la longitud de un radio y nos escribe la longitud
        de la circunferencia, el área del círculo y el volumen de la esfera que corresponden con dicho radio.
         */
        sc = new Scanner (System.in);
        System.out.println("\nEjercicio 5");
        System.out.println("Ingrese el radio");
        double radio = sc.nextDouble();

        double circulo = 2 * Math.PI * radio;
        System.out.println("Perimetro:" + circulo);
        double areaC = Math.PI * radio * radio;
        System.out.println("Area:" + areaC);
        double volumenE = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("Volumen:" + volumenE);

        /*
        Ejercicio 6:Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado.
         */
        System.out.println("\nEjercicio 6");
        sc = new Scanner (System.in);
        System.out.println("Ingrese precio de articulo");
        double precioV = sc.nextDouble();
        System.out.println("Ingrese precio real");
        double precioR = sc.nextDouble();

        double porcentaje = ((precioV - precioR) / precioV) * 100;
        System.out.println("porcentaje:" + porcentaje);

        /*
        Ejercicio 7:Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
         */
        System.out.println("\nEjercicio 7");
        sc = new Scanner(System.in);
        System.out.println("Ingrese las millas marina");
        double millas = sc.nextDouble();

        double metros = millas * 1852;
        System.out.println("metros:" + metros);

        /*
        Ejercicio 8:Escribe un programa que lee dos números y los visualiza en orden ascendente.
         */
        System.out.println("\nEjercicio 8");
        sc = new Scanner(System.in);
        System.out.println()















    }
}