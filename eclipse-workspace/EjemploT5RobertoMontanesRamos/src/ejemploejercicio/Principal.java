package ejemploejercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Map<Integer, Contacto> miAgenda = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int idBuscar;

		miAgenda.put(1, new Contacto("1", "Juan", "123456789"));
		miAgenda.put(4, new Contacto("4", "aaaaaa", "123456987"));
		miAgenda.put(7, new Contacto("7", "Roberto", "111111111"));
		miAgenda.put(2, new Contacto("2", "Pedro", "987654321"));

		Agenda a = new Agenda(miAgenda);

		System.out.print("Ingrese el ID que desea buscar: ");
		idBuscar = Integer.parseInt(scanner.nextLine());

		Contacto contactoEncontrado = a.buscarPorId(idBuscar);
		System.out.println("Contacto encontrado con ID " + idBuscar + ": " + contactoEncontrado);

		
		System.out.println("\n "+miAgenda);
		
		scanner.close();
	}
}
