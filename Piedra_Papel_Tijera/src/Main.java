import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");
        System.out.println("Usa:");
        System.out.println("P = Piedra");
        System.out.println("L = Papel");
        System.out.println("T = Tijeras");
        System.out.println("S = Salir\n");

        while (true) {
            System.out.print("Elige tu jugada (P/L/T o S para salir): ");
            char jugador = Character.toUpperCase(sc.next().charAt(0));

            if (jugador == 'S') {
                System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                break;
            }

            if (jugador != 'P' && jugador != 'L' && jugador != 'T') {
                System.out.println("Opción no válida, intenta de nuevo.\n");
                continue;
            }

            // Jugada aleatoria del ordenador
            char[] opciones = {'P', 'L', 'T'};
            char ordenador = opciones[random.nextInt(3)];

            System.out.println("La computadora eligió: " + ordenador);

            // Decidir ganador
            if (jugador == ordenador) {
                System.out.println("Empate");
            } else if ((jugador == 'P' && ordenador == 'T') ||
                    (jugador == 'T' && ordenador == 'L') ||
                    (jugador == 'L' && ordenador == 'P')) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("Perdiste");
            }

            System.out.println("----------------------------");
        }

    }
}