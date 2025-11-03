import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class E1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto" );
        String texto = scanner.nextLine();

        String[] palabras = texto.split("\\s+");


        System.out.println("\nLas palabras son:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}