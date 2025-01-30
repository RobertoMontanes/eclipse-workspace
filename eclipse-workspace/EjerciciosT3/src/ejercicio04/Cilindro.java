package ejercicio04;

public class Cilindro {

	//Volumen cilindro: π r² h
	
	//Atributos
	private double radio;
	private double altura;
	
	//Getters && Setters
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	//metodos
	
	public double calcularVolumen(double radio, double altura) {
		double volumen;
		volumen = Math.PI*radio*radio*altura;
		return volumen;
	}
	
	
	
	
	
	
	
	
	
	
	
}
