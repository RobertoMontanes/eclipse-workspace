package ejemploejercicio;

import java.util.Map;
import java.util.TreeMap;

public class Agenda {

	private Map<Integer, Contacto> miAgenda;

	public Agenda(Map<Integer, Contacto> miAgenda) {
		this.miAgenda = miAgenda;
	}

	public Map<Integer, Contacto> getMiAgenda() {
		return miAgenda;
	}

	public void setMiAgenda(Map<Integer, Contacto> miAgenda) {
		this.miAgenda = miAgenda;
	}

	public void agregarContacto(Integer i, Contacto c) {
		miAgenda.put(i, c);
	}

	public Map<Integer, Contacto> ordenarPorClave() {
		return new TreeMap<>(miAgenda);
	}

	public Map<Integer, Contacto> ordenarPorNombre() {
		Map<Integer, Contacto> aux = new TreeMap<>(miAgenda);
		return aux;
	}

	public Contacto buscarPorId(Integer id) {
 
		return miAgenda.get(id);

	}
}
