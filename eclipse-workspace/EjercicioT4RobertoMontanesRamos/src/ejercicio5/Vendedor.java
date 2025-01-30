package ejercicio5;

public class Vendedor extends Empleado {

	private int cantidadVentas;
	private int incentivo;

	public Vendedor(String nombre, String apellido, double sueldoBase, int idEmpleado, int cantidadVentas,
			int incentivo) {
		super(nombre, apellido, sueldoBase, idEmpleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
	}

	public Vendedor() {

	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public int getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(int incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Vendedor [cantidadVentas=" + cantidadVentas + ", incentivo=" + incentivo + "]";
	}

	public double calcularSueldoBase(int horasTrabajadas, double sueldoHora, double incentivo, int cantidadVentas) {
		return (cantidadVentas * incentivo) / 100;
	}

}
