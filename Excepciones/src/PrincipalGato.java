//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrincipalGato {
    public static void main(String[] args) {
        try {
            Gato g1 = new Gato("Misu", 3);
            g1.imprimir();

            Gato g2 = new Gato("Pet", 2); // error
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
