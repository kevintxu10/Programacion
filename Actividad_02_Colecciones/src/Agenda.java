import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void anadeContacto(Contacto c) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(c.getNombre())) {
                System.out.println("El contacto ya existe.");
                return;
            }
        }
        contactos.add(c);
        System.out.println("Contacto añadido correctamente.");
    }

    public void buscaContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public void eliminaContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(c);
                System.out.println("Contacto eliminado.");
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public void visualizaAgenda() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            for (Contacto c : contactos) {
                System.out.println(c);
            }
        }
    }

    public int numeroContactos() {
        return contactos.size();
    }
}

