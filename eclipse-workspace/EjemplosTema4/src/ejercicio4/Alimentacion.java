package ejercicio4;

public class Alimentacion extends Producto {

	private double descuentoCaducidad;

	public Alimentacion(double precioUnitario, int id, String nombre, double descuentoCaducidad) {
		super(precioUnitario, id, nombre);
		this.descuentoCaducidad = descuentoCaducidad;
	}

	public double getDescuentoCaducidad() {
		return descuentoCaducidad;
	}

	public void setDescuentoCaducidad(double descuentoCaducidad) {
		this.descuentoCaducidad = descuentoCaducidad;
	}

	@Override
	public String toString() {
		return "Alimentacion [descuentoCaducidad=" + descuentoCaducidad + "]";
	}

}
