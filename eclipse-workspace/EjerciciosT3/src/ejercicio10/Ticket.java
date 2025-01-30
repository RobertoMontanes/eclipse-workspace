package ejercicio10;

public class Ticket {

	private double precio;
	private int numSaltos;
	private int precioSaltos;

	public Ticket(double precio, int numPersonas, int numSaltos, int precioSaltos) {
		super();
		this.precio = precio;
		this.numSaltos = numSaltos;
		this.precioSaltos = precioSaltos;
	}

	public int getNumSaltos() {
		return numSaltos;
	}

	public void setNumSaltos(int numSaltos) {
		this.numSaltos = numSaltos;
	}

	public int getPrecioSaltos() {
		return precioSaltos;
	}

	public void setPrecioSaltos(int precioSaltos) {
		this.precioSaltos = precioSaltos;
	}

	public Ticket(double precio) {

	}

	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ticket [precio=" + precio + ", numSaltos=" + numSaltos + ", precioSaltos=" + precioSaltos + "]";
	}

	

	public double calcularPrecio() {
		return precio + (numSaltos * precioSaltos);
	}
	
	
}
