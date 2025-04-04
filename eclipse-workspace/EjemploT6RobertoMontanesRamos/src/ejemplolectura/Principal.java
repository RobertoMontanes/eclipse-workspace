package ejemplolectura;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre, aux;
		int edad;
		double notaMedia;
		System.out.println("Dime tu nombre");
		nombre = sc.nextLine();
		System.out.println("Su nombre es: " + nombre);
		
		System.out.println("Dime tu edad");
		aux = sc.nextLine();
		edad= Integer.parseInt(aux);
		System.out.println("Su edad es: " + edad);
		
		
		System.out.println("Dime la nota media");
		aux = sc.nextLine();
		notaMedia = Double.parseDouble(aux);
		System.out.println("Su nota media es: " + notaMedia);
		
		sc.close();
		
		
	}

}
