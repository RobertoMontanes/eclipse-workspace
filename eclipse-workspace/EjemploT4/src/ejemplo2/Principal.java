package ejemplo2;

public class Principal {

	public static void main(String[] args) {

		Triangulo t = new Triangulo("Negro", 2, 4); 
		System.out.println(t.calcularArea());

		t.imprimirDetalles();
		
		System.out.println(t instanceof Figura);
	}

}
