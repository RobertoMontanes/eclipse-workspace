package ejercicio4;

public class Linea {

	private Producto p1;
	private int cantidad;

	public Linea(Producto p1, int cantidad) {
		super();
		this.p1 = p1;
		this.cantidad = cantidad;
	}

	public Producto getP1() {
		return p1;
	}

	public void setP1(Producto p1) {
		this.p1 = p1;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Linea [p1=" + p1 + ", cantidad=" + cantidad + "]";
	}

}
