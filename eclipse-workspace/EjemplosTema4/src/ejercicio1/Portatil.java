package ejercicio1;

public class Portatil extends Ordenador {

	private double costeSeguroPantalla;

	public Portatil(int capSSD, int frecProcesador, double precioBase, String marca, boolean seguroPantalla,
			double costeSeguro) {
		super(capSSD, frecProcesador, precioBase, marca);
		this.costeSeguroPantalla = costeSeguroPantalla;
		this.costeSeguroPantalla = costeSeguro;
	}

	@Override
	public String toString() {
		return "Portatil [seguroPantalla=" + costeSeguroPantalla + ", costeSeguro=" + costeSeguroPantalla + "]";
	}

	public boolean isSeguroPantalla() {
		return costeSeguroPantalla;
	}

	public void setSeguroPantalla(boolean seguroPantalla) {
		this.costeSeguroPantalla = costeSeguroPantalla;
	}

	public double getCosteSeguro() {
		return costeSeguroPantalla;
	}

	public void setCosteSeguro(double costeSeguro) {
		this.costeSeguroPantalla = costeSeguro;
	}

	public double calcularPrecioVenta(double porcentajeGanancia) {
		double precioFinal = super.calcularPrecioVenta(porcentajeGanancia);
		if (seguroPantalla) {
			precioFinal += costoSeguroPantalla;
		}
		return precioFinal;
	}

}
