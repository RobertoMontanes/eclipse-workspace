package ejercicio1;

public class Ordenador {

	private double capSSD;
	private double frecProcesador;
	private double precioBase;
	private String marca;

	public Ordenador(double capSSD, double frecProcesador, double precioBase, String marca) {
		super();
		this.capSSD = capSSD;
		this.frecProcesador = frecProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}
	public Ordenador() {
		super();
	}

	public double getCapSSD() {
		return capSSD;
	}

	public void setCapSSD(int capSSD) {
		this.capSSD = capSSD;
	}

	public double getFrecProcesador() {
		return frecProcesador;
	}

	public void setFrecProcesador(int frecProcesador) {
		this.frecProcesador = frecProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capSSD=" + capSSD + ", frecProcesador=" + frecProcesador + ", precioBase=" + precioBase
				+ ", marca=" + marca + "]";
	}

	public double calcularPVP(int gananciaVendedor) {
		int cien = 100;
		return precioBase+(precioBase*gananciaVendedor/cien);
	}
	
	public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad del Disco Duro: " + capSSD + " GB");
        System.out.println("Frecuencia del Procesador: " + frecProcesador + " GHz");
        System.out.println("Precio Base: " + precioBase + " €");
    }
}
