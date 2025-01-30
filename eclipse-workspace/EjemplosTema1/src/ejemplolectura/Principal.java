package ejemplolectura;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		int edad;
		double precio;
		
		System.out.println("Hola, leemos datos");
		
		System.out.println("Introduce su nombre");
		nombre=Leer.dato();
		
		System.out.println("¿Cuál es tu edad?");
		edad=Leer.datoInt();
		
		
		System.out.println("Ahora dime el precio de su libertad:");
		precio=Leer.datoDouble();
		
		System.out.println("Tu nombre es: "+nombre);
		System.out.println("Tu edad es: "+edad);
		System.out.printf("El precio de su libertad es: %.2f€",precio);

		
		
	}

}
