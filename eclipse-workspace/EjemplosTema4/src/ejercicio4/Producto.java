package ejercicio4;

public class Producto {

	private double precioUnitario;
	private int id;
	private String nombre;

	public Producto(double precioUnitario, int id, String nombre) {
		super();
		this.precioUnitario = precioUnitario;
		this.id = id;
		this.nombre = nombre;
	}
	public Producto() {
		super();
		
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", id=" + id + ", nombre=" + nombre + "]";
	}

	
}
