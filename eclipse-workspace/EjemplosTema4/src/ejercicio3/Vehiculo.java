package ejercicio3;

public class Vehiculo {

	private String categoriaEmisiones;
	private double impuestoBase;

	public Vehiculo(String categoriaEmisiones, double impuestoBase) {
		super();
		this.categoriaEmisiones = categoriaEmisiones;
		this.impuestoBase = impuestoBase;
	}

	@Override
	public String toString() {
		return "Vehiculo [categoriaEmisiones=" + categoriaEmisiones + ", impuestoBase=" + impuestoBase + "]";
	}

	public String getCategoriaEmisiones() {
		return categoriaEmisiones;
	}

	public void setCategoriaEmisiones(String categoriaEmisiones) {
		this.categoriaEmisiones = categoriaEmisiones;
	}

	public double getImpuestoBase() {
		return impuestoBase;
	}

	public void setImpuestoBase(double impuestoBase) {
		this.impuestoBase = impuestoBase;
	}

	public double calcularImpuesto() {
		return impuestoBase;
	}
	
	
	
}
