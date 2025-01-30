package ejercicio4;

public class Electronica extends Producto {

	private double impuestoEspecial;

	public Electronica(double precioUnitario, int id, String nombre, double impuestoEspecial) {
		super(precioUnitario, id, nombre);
		this.impuestoEspecial = impuestoEspecial;
	}

	public double getImpuestoEspecial() {
		return impuestoEspecial;
	}

	public void setImpuestoEspecial(double impuestoEspecial) {
		this.impuestoEspecial = impuestoEspecial;
	}

	@Override
	public String toString() {
		return "Electronica [impuestoEspecial=" + impuestoEspecial + "]";
	}

}
