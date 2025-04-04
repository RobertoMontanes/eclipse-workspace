package ejemploejercicio;

public class Contacto implements Comparable<Contacto> {
	private String id;
	private String nombre;
	private String telefono;

	public Contacto(String id, String nombre, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	@Override
	public int compareTo(Contacto otro) {
		return this.nombre.compareTo(otro.nombre);
	}

	@Override
	public String toString() {
		return "Contacto{id='" + id + "', nombre='" + nombre + "', telefono='" + telefono + "'}";
	}
}
