import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        // Convertimos a minúsculas y quitamos los espacios
        frase = frase.toLowerCase().replace(" ", "");

        // Invertimos la frase
        String invertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }

        // Comparamos
        if (frase.equals(invertida)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase NO es un palíndromo.");
        }
    }
}

