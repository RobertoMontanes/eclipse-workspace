package ejercicio2;

public class Carta extends Documento {

	private int añoContratacion;

	public Carta(String nombreEmpresa, int codigoEmpresa, double facturacionEmpresa, int añoContratacion) {
		super(nombreEmpresa, codigoEmpresa, facturacionEmpresa);
		this.añoContratacion = añoContratacion;
	}

	public int getAñoContratacion() {
		return añoContratacion;
	}

	public void setAñoContratacion(int añoContratacion) {
		this.añoContratacion = añoContratacion;
	}

	@Override
	public String toString() {
		return "Carta [añoContratacion=" + añoContratacion + "]";
	}

	public void imprimirCarta() {
		super.imprimirCarta();

		System.out.println("Fecha: " + añoContratacion);
	}

}
