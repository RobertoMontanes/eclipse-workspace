package ejercicio03;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private boolean activo;
	
	public Cliente(String dni, String nombre, String apellido, boolean activo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.activo = activo;
	}
	public Cliente() {
		
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", activo=" + activo + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public double calcularIMC(double peso, double estatura) {
	    double total = peso / (estatura * estatura);
	    return total;
	}

	
}
