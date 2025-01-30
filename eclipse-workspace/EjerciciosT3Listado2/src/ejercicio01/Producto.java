package ejercicio01;

public class Producto {

	private int id;
	private double precioFabrica;
	private String nombre;
	private boolean fragil;
	private int seccion;

	public Producto(int id, double precioFabrica, String nombre, boolean fragil, int seccion) {
		this.id = id;
		this.precioFabrica = precioFabrica;
		this.nombre = nombre;
		this.fragil = fragil;
		this.seccion = seccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", precioFabrica=" + precioFabrica + ", nombre=" + nombre + ", fragil=" + fragil
				+ ", seccion=" + seccion + "]";
	}

	public double calcularPrecioCoste(double porcentajeTransporte) {
		return precioFabrica + (precioFabrica * porcentajeTransporte / 100);
	}
}
