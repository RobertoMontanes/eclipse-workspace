package ejercicio4;

public class Alimentacion extends Producto {

	private double diasCaducidad;
	private boolean refrigeracion;

	public Alimentacion(double precioUnitario, int id, String nombre, double diasCaducidad, boolean refrigeracion) {
		super(precioUnitario, id, nombre);
		this.diasCaducidad = diasCaducidad;
		this.refrigeracion = refrigeracion;
	}

	public double getDiasCaducidad() {
		return diasCaducidad;
	}

	public void setDiasCaducidad(double diasCaducidad) {
		this.diasCaducidad = diasCaducidad;
	}

	public boolean isRefrigeracion() {
		return refrigeracion;
	}

	public void setRefrigeracion(boolean refrigeracion) {
		this.refrigeracion = refrigeracion;
	}

	@Override
	public String toString() {
		return "Alimentacion [diasCaducidad=" + diasCaducidad + ", refrigeracion=" + refrigeracion + "]";
	}

	public double calcularPVP(double iva, double descuento, int topeCaducidad) {
		double total = 0.0;

		if (diasCaducidad < topeCaducidad) {
			total = super.calcularPVP(iva, descuento, topeCaducidad)
					- super.calcularPVP(iva, descuento, topeCaducidad) * descuento / 100;
		} else {
			total = super.calcularPVP(iva, descuento, topeCaducidad);
		}
		return total;
	}

	public void avisoCaducidad(int topeCaducidad) {
		if (diasCaducidad < topeCaducidad) {
			System.out.println("¡Aviso! " + getNombre() + " está a punto de caducar.");
		}
	}
}
