package ejercicio3;

public class Motocicletas extends Vehiculo {

	private int cilindradas;

	public Motocicletas(String categoriaEmisiones, double impuestoBase, int cilindradas) {
		super(categoriaEmisiones, impuestoBase);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Motocicletas [cilindradas=" + cilindradas + "]";
	}
	
	public double calcularImpuesto() {
		double porcentajecilindrada = 60;
		return cilindradas*(porcentajecilindrada/100);
	}
	

}
