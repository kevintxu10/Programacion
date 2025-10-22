public class E14 {
    public static void main(String[] args) {

        // Calcular el tamaño total del array: 1+2+3+...+10 = 55
        int N = 0;
        for (int i = 1; i <= 10; i++) {
            N += i;
        }

        int[] array = new int[N];
        int index = 0;

        // Generar la secuencia
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                array[index] = i;
                index++;
            }
        }

        // Mostrar el array
        System.out.println("Secuencia generada:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
