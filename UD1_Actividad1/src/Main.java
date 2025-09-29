import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Escribe un programa que dé los “buenos días”.
         System.out.println("Ejercicio 01");
         System.out.println ("Buenos dias");

        /*
        Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
         */

        System.out.println("Ejercicio 02");
        double lado = 5;
        double area = lado * lado;
        System.out.println("Lado:" + lado);
        System.out.println("area:" + area);

        /*
        Ejercicio 3: Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
         */

        System.out.println("\nEjercicio 03");
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el valor del lado del cuadrado");
        double lado2 = sc.nextDouble();

        double area2 = lado2 * lado2;
        System.out.println("Lado:" + lado2);
        System.out.println("area:" + area2);

        /*
        Ejercicio 04: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y division

         */

        System.out.println("\nEjercicio 04");
        Scanner sc2 = new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        double numero1 = sc2.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double numero2 = sc2.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        System.out.println("suma:" + suma);
        System.out.println("resta:" + resta);
        System.out.println("multiplicacion:" + multiplicacion);
        System.out.println("division:" + division);

        /*
        Ejercicio 05:Escribe un programa que toma como dato de entrada un número que corresponde a la longitud de un radio y nos escribe la longitud
        de la circunferencia, el área del círculo y el volumen de la esfera que corresponden con dicho radio.
         */

        System.out.println("\nEjercicio 05");
        System.out.println("Ingrese el radio");
        double radio = sc.nextDouble();
        double circulo = 2 * Math.PI * radio;
        System.out.println("Circulo:" + circulo);




    }
}