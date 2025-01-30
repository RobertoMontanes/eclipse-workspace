package ejercicio2interfaces;

public class Alimentacion extends Producto {

	private boolean refrigerado;

	public Alimentacion(String nombre, double precio, boolean refrigerado) {
		super(nombre, precio);
		this.refrigerado = refrigerado;
	}

	public boolean isRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	@Override
	public String toString() {
		return "Alimentacion [refrigerado=" + refrigerado + "]";
	}
	
	public double calcularPVP(int iva) {
		return super.calcularPVP(iva)+super.calculoIva(getPrecio(), 0);
	}
}
