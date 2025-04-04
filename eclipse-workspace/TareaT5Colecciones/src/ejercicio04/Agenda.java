package ejercicio04;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<Contacto, String> agenda;

    public Agenda() {
        this.agenda = new HashMap<>();
    }

    public void agregarContacto(Contacto contacto, String telefono) {
        agenda.put(contacto, telefono);
    }

    public void borrarContacto(Contacto contacto) {
        Contacto key = buscarContacto(contacto);
        if (key != null) {
            agenda.remove(key);
        }
    }

    public String buscarPorNombre(String nombre) {
        for (Contacto contacto : agenda.keySet()) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return agenda.get(contacto);
               
            }
        }
        return null;
    }

    public void modificarTelefono(Contacto contacto, String nuevoTelefono) {
        Contacto key = buscarContacto(contacto);
        if (key != null) {
            agenda.put(key, nuevoTelefono);
        }
    }

    public void mostrarContactos() {
        for (Map.Entry<Contacto, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private Contacto buscarContacto(Contacto contacto) {
        for (Contacto c : agenda.keySet()) {
            if (c.getNombre().equals(contacto.getNombre()) && c.getApellido().equals(contacto.getApellido())) {
                return c;
            }
        }
        return null;
    }
}
