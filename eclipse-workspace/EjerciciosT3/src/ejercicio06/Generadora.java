package ejercicio06;

public class Generadora {

	public String generarQuiniela() {
		int numAleatorio;
		numAleatorio = (int) (Math.random() * 3);

		switch (numAleatorio) {
			case 0:
				return "Empate";
			case 1:
				return "Gana equipo local";
			case 2:
				return "Gana equipo visitante";
			default:
				return "Error";
		}
	}

	public String generarParImpar() {
		int numAleatorio;
		numAleatorio = (int) (Math.random() * 100);
		if (numAleatorio % 2 == 0) {
			return "Par";
		} else {
			return "Impar";
		}
	}

	public int generarChinos() {
		return (int) (Math.random() * 3) + 1; 
	}

	public int generarPrimitiva() {
		return (int) (Math.random() * 49) + 1; 
	}
}
