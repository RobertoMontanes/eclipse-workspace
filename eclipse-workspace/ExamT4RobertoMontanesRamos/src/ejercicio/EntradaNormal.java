package ejercicio;

public class EntradaNormal implements IDesglosable {

	private int zonaAsiento;
	private int numeroFila;
	private int numeroAsiento;

	public EntradaNormal(int zonaAsiento, int numeroFila, int numeroAsiento) {
		super();
		this.zonaAsiento = zonaAsiento;
		this.numeroFila = numeroFila;
		this.numeroAsiento = numeroAsiento;
	}

	public int getZonaAsiento() {
		return zonaAsiento;
	}

	public void setZonaAsiento(int zonaAsiento) {
		this.zonaAsiento = zonaAsiento;
	}

	public int getNumeroFila() {
		return numeroFila;
	}

	public void setNumeroFila(int numeroFila) {
		this.numeroFila = numeroFila;
	}

	public int getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	@Override
	public String toString() {
		return "EntradaNormal [zonaAsiento=" + zonaAsiento + ", numeroFila=" + numeroFila + ", numeroAsiento="
				+ numeroAsiento + "]";
	}

	public double calcularPrecioEntrada(int zonaAsiento, double descuento, double costoAdicional) {
		if (zonaAsiento == 1) {
			return 40.0;
		} else {
			return 70.0;
		}
	}

	@Override
	public double calcularIVA(double iva, int zonaAsiento, double descuento, double costoAdicional) {
		return calcularPrecioEntrada(zonaAsiento, descuento, costoAdicional) * iva / 100;
	}

}
