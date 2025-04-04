package ejercicioexamen2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		List<Socio> listaSocios = new ArrayList<Socio>();
		Scanner scanner = new Scanner(System.in);
		Club club = new Club(listaSocios);
		int opcion;
		boolean condition = false;
		listaSocios.add(new Socio("Juan", 25, 50, false));
		listaSocios.add(new Socio("Ana", 30, 60, true));
		listaSocios.add(new Socio("Luis", 40, 70, false));
		listaSocios.add(new Socio("Maria", 35, 80, true));
		
		do {
			System.out.println();
			System.out.println("0. salir");
			System.out.println("1. agregar socio");
			System.out.println("2. mostrar socios");
			System.out.println("3. buscar socios por mensualidad");
			System.out.println("4. buscar socios por nombre");
			
			opcion = Integer.parseInt(scanner.nextLine());
			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("Introduce el nombre del socio");
				String nombre = scanner.nextLine();
				System.out.println("Introduce la edad del socio");
				int edad = Integer.parseInt(scanner.nextLine());
				System.out.println("Introduce la mensualidad del socio");
				double mensualidad = Double.parseDouble(scanner.nextLine());
				System.out.println("Introduce si el socio es profesional (1. si, 2. cualquiero otro numero no)");
				int profesional = Integer.parseInt(scanner.nextLine());
				if (profesional==1) {
					condition = true;
				}
				else {
					condition = false;
				}
				club.agregarSocio(new Socio(nombre, edad, mensualidad, condition));				
				
				break;
			case 2:
				club.mostrarSocios();
				break;
			case 3:
				System.out.println("Dime la mensualidad del socio");
				double mensualidadBusqueda = Double.parseDouble(scanner.nextLine());
				System.out.println(club.buscarSociosPorPagoMensualidad(mensualidadBusqueda));
				break;
			case 4:
				System.out.println("Dime el nombre del socio");
				String nombreBusqueda = scanner.nextLine();
				System.out.println(club.buscarSociosPorNombre(nombreBusqueda));
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;

			default:
				break;
			}
		} while (opcion!=0);
	}

}
