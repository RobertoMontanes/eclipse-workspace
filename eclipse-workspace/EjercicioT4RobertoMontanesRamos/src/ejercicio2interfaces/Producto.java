package ejercicio2interfaces;

public class Producto implements IImpuesto {

	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	@Override
	public double calculoIva(double precio, int iva) {
		return precio * iva / 100;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		return 0;

	}

	public double calcularPVP(int iva) {
		return precio + 10;
	}

}
