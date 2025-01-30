package ejemplo3poliformismo;

public class Circulo extends Figura {

	private double radio;

	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	public double calcularArea(){
		double area;
		area = Math.PI*radio*radio;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro;
		perimetro = 2*Math.PI*radio;
		return perimetro;
	}
	public void mostrarRadianes() {
		System.out.println("Solo estoy en la clase Circulo");
	}

}
