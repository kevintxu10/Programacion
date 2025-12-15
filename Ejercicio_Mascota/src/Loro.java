public class Loro extends Animal {
    public Loro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getTipo() {
        return "Loro";
    }
}

