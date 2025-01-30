package ejercicio5;

public class Empleado {

	private String nombre;
	private String apellido;
	private double sueldoBase;
	private int idEmpleado;

	public Empleado(String nombre, String apellido, double sueldoBase, int idEmpleado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBase = sueldoBase;
		this.idEmpleado = idEmpleado;
	}
	public Empleado() {
		
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

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", sueldoBase=" + sueldoBase + ", idEmpleado="
				+ idEmpleado + "]";
	}
	
	public double calcularSueldoBase(int horasTrabajadas, double sueldoHora, double incentivo, int cantidadVentas) {
		return horasTrabajadas*sueldoHora;
	}
	public void comprobarVentas(double ventas) {
		
	}
}
