package ejercicioexamen;

public class Trastero implements Comparable<Trastero>{

	private double metrosCuadrados;
	private String direccion;
	private int numeroTrastero;
	private double precio;
	private boolean ocupado;

	public Trastero(double metrosCuadrados, String direccion, int numeroTrastero, double precio, boolean ocupado) {
		super();
		this.metrosCuadrados = metrosCuadrados;
		this.direccion = direccion;
		this.numeroTrastero = numeroTrastero;
		this.precio = precio;
		this.ocupado = ocupado;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroTrastero() {
		return numeroTrastero;
	}

	public void setNumeroTrastero(int numeroTrastero) {
		this.numeroTrastero = numeroTrastero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Trastero [metrosCuadrados=" + metrosCuadrados + ", direccion=" + direccion + ", numeroTrastero="
				+ numeroTrastero + ", precio=" + precio + ", ocupado=" + ocupado + "]";
	}

}
