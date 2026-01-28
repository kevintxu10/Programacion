public class Ejercicio4 {

    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("El número es negativo");
        }
        System.out.println("Positivo: " + p);
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
             throw new Exception("El número no es negativo");
        }
        System.out.println("Negativo: " + n);
    }

    public static void main(String[] args) {
        try {
            imprimePositivo(5);
            imprimeNegativo(-3);
            imprimePositivo(-2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

