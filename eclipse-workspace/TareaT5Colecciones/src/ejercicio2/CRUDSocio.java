package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class CRUDSocio {
    
	private ArrayList<Socio> listaSocios = new ArrayList<>();

    
    public void agregarSocio(Socio socio) {
        listaSocios.add(socio);
        System.out.println("✅ Socio agregado: " + socio);
    }

    // Leer o buscar un socio por ID
    public Socio buscarSocio(int id) {
        for (Socio socio : listaSocios) {
            if (socio.getId() == id) {
                return socio;
            }
        }
        return null; 
    }
    
    
    //buscar socio por edad
    
    
    public void listarSocios() {
        if (listaSocios.isEmpty()) {
            System.out.println("⚠️ No hay socios registrados.");
        } else {
            System.out.println("📋 Lista de socios:");
            for (Socio socio : listaSocios) {
                System.out.println(socio);
            }
        }
    }
    
    
    // Modificar un socio por ID
    public boolean modificarSocio(int id, String nuevoNombre, int nuevaEdad) {
        Socio socio = buscarSocio(id);
        if (socio != null) {
            socio.setNombre(nuevoNombre);
            socio.setEdad(nuevaEdad);
            System.out.println("✏️ Socio modificado: " + socio);
            return true;
        }
        System.out.println("❌ No se encontró un socio con ID " + id);
        return false;
    }
    
    public boolean delete(int index) {
        if (index >= 0 && index < listaSocios.size()) {
            listaSocios.remove(index);
            System.out.println("🗑️ Socio eliminado en el índice: " + index);
            return true;
        } else {
            System.out.println("❌ Índice fuera de rango: " + index);
            return false;
        }
    }
    
    
    
    // Eliminar un socio por ID
    public boolean eliminarSocio(int id) {
        Iterator<Socio> iterator = listaSocios.iterator();
        while (iterator.hasNext()) {
            Socio socio = iterator.next();
            if (socio.getId() == id) {
                iterator.remove();
                System.out.println("🗑️ Socio eliminado: " + socio);
                return true;
            }
        }
        System.out.println("❌ No se encontró un socio con ID " + id);
        return false;
    }
}

	

	