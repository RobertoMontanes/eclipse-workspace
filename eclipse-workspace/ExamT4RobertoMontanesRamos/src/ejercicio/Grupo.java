package ejercicio;

public class Grupo extends EntradaNormal {

	private int numeroPersonas;
	Famoso f;

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public Famoso getF() {
		return f;
	}

	public void setF(Famoso f) {
		this.f = f;
	}

	public Grupo(int zonaAsiento, int numeroFila, int numeroAsiento, int numeroPersonas, Famoso f) {
		super(zonaAsiento, numeroFila, numeroAsiento);
		this.numeroPersonas = numeroPersonas;
		this.f = f;
	}

	@Override
	public String toString() {
		return "Grupo [numeroPersonas=" + numeroPersonas + ", f=" + f + "]";
	}

	public double calcularPrecioEntrada(int zonaAsiento, double descuento, double costoAdicional) {
		if (numeroPersonas > 10) {
			return super.calcularPrecioEntrada(zonaAsiento, descuento, costoAdicional)-(super.calcularPrecioEntrada(zonaAsiento, descuento, costoAdicional)*descuento/100);
		}else {
			return super.calcularPrecioEntrada(zonaAsiento, descuento, costoAdicional);
		}
	}
	
}
