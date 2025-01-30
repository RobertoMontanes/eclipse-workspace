package ejemplo3poliformismo;

public class OperacionesFigura {

	public double calcularAreaFigura(Figura f) {
		return f.calcularArea();

	}

	public double calcularSumaTodas(Figura[] lista) {

		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Circulo) {
				((Circulo)lista[i]).imprimirTexto();
			}
			suma += lista[i].calcularArea();
		}
		return suma;

	}

	
}

