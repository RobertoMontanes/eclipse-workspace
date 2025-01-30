package ejemplo3poliformismo;

public class Principal {

	public static void main(String[] args) {

		// Figura f = new Figura(); no podemos instanciar objetos de una clase abstracta

		Cuadrado c = new Cuadrado("Cuadrado 1", "Negro", 2);
		Figura f2 = new Cuadrado("Cuadrado 2", "Blanco", 3);
		Figura f3 = new Circulo("Circulo 1", "Rojo", 4);
		
		Figura [] lista = {f2, f2, f3};
		f3.imprimirTexto();
		OperacionesFigura op = new OperacionesFigura();
		System.out.println(op.calcularAreaFigura(c));
		System.out.println("La suma es: " + op.calcularSumaTodas(lista));
		
		if (f3 instanceof Circulo) {
			((Circulo)f3).imprimirTexto();
		}
		
		
		

	}

}
