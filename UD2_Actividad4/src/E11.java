public class E11 {
    public static void main(String[] args) {


        int[] array1 = new int[100]; // Primer array
        int[] array2 = new int[100]; // Segundo array

        // Llenar el primer array con los números del 1 al 100
        for (int i = 0; i < 100; i++) {
            array1[i] = i + 1;
        }

        // Copiar los valores del primer array al segundo en orden inverso
        for (int i = 0; i < 100; i++) {
            array2[i] = array1[(array1.length - 1) - i];
        }

        // Mostrar ambos arrays
        System.out.println("Array 1 (orden normal):");
        for (int i = 0; i < 100; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n\nArray 2 (orden inverso):");
        for (int i = 0; i < 100; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}