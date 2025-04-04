package Ejercicio03;

class Alumno {

	private String nombre;
	private double nota;

	public Alumno(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno: " + nombre + ", Nota: " + nota;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Alumno alumno = (Alumno) obj;
		return nombre.equalsIgnoreCase(alumno.nombre);
	}

	@Override
	public int hashCode() {
		return nombre.toLowerCase().hashCode();
	}
}
