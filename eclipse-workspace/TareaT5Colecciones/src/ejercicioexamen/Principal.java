package ejercicioexamen;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Principal {

	public static void main(String[] args) {
		
		Set<Trastero> listaTrasteros = new HashSet<Trastero>();
		Scanner scanner = new Scanner(System.in);
		
		listaTrasteros.add(new Trastero(10, "Calle 1", 1, 100, false));
		listaTrasteros.add(new Trastero(20, "Calle 2", 2, 200, true));
		listaTrasteros.add(new Trastero(30, "Calle 3", 3, 300, false));
		listaTrasteros.add(new Trastero(40, "Calle 4", 4, 400, true));
		
		Oficina oficina = new Oficina(listaTrasteros);
		
		int opcion;
		boolean ocupado2=false;
		
		do {
			System.out.println();
			System.out.println("1. agregar trastero");
			System.out.println("2. Mostrar trasteros");
			System.out.println("3. buscar trastero por precio");
			System.out.println("4. buscar mas caro");
			System.out.println("5. eliminar trastero");
			System.out.println("6. agregar trastero");
			System.out.println("7. agregar trastero");
			System.out.println("8. agregar trastero");
			System.out.println("9. agregar trastero");
			System.out.println("10. agregar trastero");
			System.out.println("0. salir");
			opcion = scanner.nextInt();
			
			
			switch (opcion) {
			case 0:
				System.out.println("Saliendo ...");
				break;
			case 1:
				System.out.println("Introduce metros cuadrados");
				double metrosCuadrados = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Introduce direccion");
				String direccion = scanner.next();
				System.out.println("Introduce numero trastero");
				int numeroTrastero = scanner.nextInt();
				System.out.println("Introduce precio");
				double precio = scanner.nextDouble();
				System.out.println("Introduce 1 para ocupado o 0. para libre");
				int ocupado = Integer.parseInt(scanner.nextLine());
				if(ocupado==1) {
					ocupado2=true;
				}else {
					ocupado2=false;
				}
				oficina.agregarTrastero(new Trastero(metrosCuadrados, direccion, numeroTrastero, precio, ocupado2));
				break;
			case 2:
				oficina.mostrarTrasteros();
				
				break;
			case 3:
				System.out.println("Dime el precio del trastero a buscar");
				double precioBuscar = scanner.nextDouble();
				System.out.println(oficina.buscarPorPrecio(precioBuscar));
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion!=0);
		

	}

}
