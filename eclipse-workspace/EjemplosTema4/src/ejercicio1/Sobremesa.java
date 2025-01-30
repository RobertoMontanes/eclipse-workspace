package ejercicio1;

public class Sobremesa extends Ordenador {

	private double precioMontaje;

	public Sobremesa(int capSSD, int frecProcesador, double precioBase, String marca, double precioMontaje) {
		super(capSSD, frecProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return "Sobremesa [precioMontaje=" + precioMontaje + "]";
	}

	public double calcularPVP(int gananciaVendedor) {
		int cien = 100;
		return super.calcularPVP(gananciaVendedor)+precioMontaje;
	}
	
	public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Precio de Montaje: " + precioMontaje + " €");
    }
	
}
