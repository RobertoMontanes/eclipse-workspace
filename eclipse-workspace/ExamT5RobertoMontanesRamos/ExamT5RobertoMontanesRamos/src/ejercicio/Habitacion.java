package ejercicio;

public class Habitacion implements Comparable<Habitacion> {

	private int numeroHabitacion;
	private String nombreCliente;
	private boolean ocupada;
	private double precioBasico;

	public Habitacion(int numeroHabitacion, String nombreCliente, boolean ocupada, double precioBasico) {
		super();
		this.numeroHabitacion = numeroHabitacion;
		this.nombreCliente = nombreCliente;
		this.ocupada = ocupada;
		this.precioBasico = precioBasico;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public double getPrecioBasico() {
		return precioBasico;
	}

	public void setPrecioBasico(double precioBasico) {
		this.precioBasico = precioBasico;
	}

	@Override
	public String toString() {
		return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", nombreCliente=" + nombreCliente + ", ocupada="
				+ ocupada + ", precioBasico=" + precioBasico + "]";
	}

	@Override
	public int compareTo(Habitacion h) {
		return Integer.compare(numeroHabitacion, h.getNumeroHabitacion());
	}

}
