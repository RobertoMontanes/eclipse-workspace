package ejercicio3;

public class Coches extends Vehiculo {

	private int potencia;

	public Coches(String categoriaEmisiones, double impuestoBase, int potencia) {
		super(categoriaEmisiones, impuestoBase);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Coches [potencia=" + potencia + "]";
	}
	
	public double calcularImpuesto() {
		double porcentajePotencia = 25;
		return potencia*(porcentajePotencia/100);
	}

}
