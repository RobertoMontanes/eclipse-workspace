package ejercicio12;


public class Principal {

	public static void main(String[] args) {

		/*. Imprime por pantalla un ticket de una tienda. El empleado se llama “John Snow” y el cliente ha
comprado 4 latas de Coca Cola a 1.20 €, una bolsa de pipas de 0.40 € y una espada llamada “Garra”
que cuesta 150 €. No hace falta calcular le devolución de la compra, pero puedes hacerlo si pides
cuánto dinero entrega el cliente para pagar.*/
		
		String nombre = "Jhon Snow";
		int cocacola = 4;
		double precioproducto = 1.20;
		int pipas = 1;
		double preciopipas = 1.40;
		int garra = 1;
		double preciogarra = 150;
		double totalcocacola;
		double totalpipas;
		double totalgarra;
		double TotalFinal;
		System.out.println("Hola en este ejercicio vamos a hacer un ticket de una tienda \n");
		
		totalcocacola = cocacola*precioproducto;
		totalpipas = pipas*preciopipas;
		totalgarra = garra*preciogarra;
		TotalFinal = totalcocacola+totalpipas+totalgarra;
		
		System.out.println("\t\tSuperMercado Roberto\n");
		System.out.println("Producto\tCantidad\tPrecio/U\tTotal\n");
		System.out.printf("Cocacola\t%d\t\t%.2f€\t\t%.2f€", cocacola, precioproducto, totalcocacola);
		System.out.printf("\nPipas\t\t%d\t\t%.2f€\t\t%.2f€", pipas, preciopipas, totalpipas);
		System.out.printf("\nGarra\t\t%d\t\t%.2f€\t\t%.2f€", garra, preciogarra, totalgarra);
		System.out.printf("\n\nPrecio Total \t\t\t\t\t%.2f€", TotalFinal);
		System.out.println("\n\nEmpleado: "+nombre);

	}

}