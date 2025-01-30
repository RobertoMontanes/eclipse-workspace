package ejemploimprimir;

public class Principal {

	public static void main(String[] args) {

		String nombreProducto = "Pantalla";
		int cantidad =2 ;
		double precio =  190.0;
		double total;
		total=precio*cantidad;
		
		System.out.printf("Hola, esta cosa que vamos a comprar cuesta %.1f. El objeto es una %s y me voy a llevar %d",precio, nombreProducto, cantidad);
		System.out.println("\nEl total es "+total+"€");
	}

}
