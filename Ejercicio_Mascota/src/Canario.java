public class Canario extends Animal {
    public Canario(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getTipo() {
        return "Canario";
    }
}

