package ejemplo04;

import java.util.Map;

public class Secretaria3 {
	
	private Map<Integer, Alumno> listado;

	public Secretaria3(Map<Integer, Alumno> listado) {
		super();
		this.listado = listado;
	}

	public Map<Integer, Alumno> getListado() {
		return listado;
	}

	public void setListado(Map<Integer, Alumno> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Secretaria3 [listado=" + listado + "]";
	}
	
	
	
	
}
