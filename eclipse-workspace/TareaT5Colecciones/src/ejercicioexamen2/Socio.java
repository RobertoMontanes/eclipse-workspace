package ejercicioexamen2;

public class Socio {

	private String nombre;
	private int edad;
	private double mensualidad;
	private boolean profesional;

	public Socio(String nombre, int edad, double mensualidad, boolean profesional) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.mensualidad = mensualidad;
		this.profesional = profesional;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getMensualidad() {
		return mensualidad;
	}

	public void setMensualidad(double mensualidad) {
		this.mensualidad = mensualidad;
	}

	public boolean isProfesional() {
		return profesional;
	}

	public void setProfesional(boolean profesional) {
		this.profesional = profesional;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", edad=" + edad + ", mensualidad=" + mensualidad + ", profesional="
				+ profesional + "]";
	}

}
