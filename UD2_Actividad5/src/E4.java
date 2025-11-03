import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        // Recorremos la frase carácter por carácter
        for (int j = 0; j < frase.length(); j++) {
            char c = frase.charAt(j);
            switch (c) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        // Mostramos los resultados
        System.out.println("Nº de A's: " + a);
        System.out.println("Nº de E's: " + e);
        System.out.println("Nº de I's: " + i);
        System.out.println("Nº de O's: " + o);
        System.out.println("Nº de U's: " + u);
    }
}