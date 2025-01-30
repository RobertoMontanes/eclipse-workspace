package ejercicio;

public class Famoso extends EntradaNormal {

	private String nombrePersonaFamosa;

	public Famoso(int zonaAsiento, int numeroFila, int numeroAsiento, String nombrePersonaFamosa) {
		super(zonaAsiento, numeroFila, numeroAsiento);
		this.nombrePersonaFamosa = nombrePersonaFamosa;
	}

	public String getNombrePersonaFamosa() {
		return nombrePersonaFamosa;
	}

	public void setNombrePersonaFamosa(String nombrePersonaFamosa) {
		this.nombrePersonaFamosa = nombrePersonaFamosa;
	}

	@Override
	public String toString() {
		return "Famoso [nombrePersonaFamosa=" + nombrePersonaFamosa + "]";
	}
	
	public double calcularPrecioEntrada(int zonaAsiento, double descuento, double costoAdicional) {
		return super.calcularPrecioEntrada(zonaAsiento, descuento, costoAdicional);
	}
	
	
	public void imprimirRegaloEntradaFamoso() {
		System.out.println("Nombre: " + nombrePersonaFamosa);
		System.out.println("Precio: " + calcularPrecioEntrada(getZonaAsiento(), getNumeroFila(), getNumeroAsiento()));
		System.out.println("Botella gratis para: " + nombrePersonaFamosa);
		
	}
	
	
}
