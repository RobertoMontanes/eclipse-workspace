package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * . Mostrar en pantalla un menú de un cine con 4 salas y las películas que se
		 * proyectan en cada una. Se debe leer la sala deseada y mostrar: a. Un mensaje
		 * con el precio de la entrada, que será diferente en cada sala (por ejemplo,
		 * sala vip, sala 3D, sala normal y sala para niños). b. Pedir el número de
		 * entradas. c. Calcular el precio final y mostrarlo.
		 */
	
		double salaVIP = 10;
		double sala3D = 8;
		double salaNormal = 6;
		double salaNiños = 7;
		int numeroSeleccionado;
		int numeroEntradas;
		double precioVIP;
		double precio3D;
		double precioNormal;
		double precioNiños;
		String pelicula1 = "Cars";
		String pelicula2 = "Shrek";
		String pelicula3 = "El coche fantástico";
		String pelicula4 = "Rapuncel";
		
		
		
		
		do {
			System.out.println("\n\nSelecciona una sala\n");
			System.out.println("1. SalaVIP ("+pelicula1+")");
			System.out.println("2. Sala 3D("+pelicula2+")");
			System.out.println("3. Sala Normal ("+pelicula3+")");
			System.out.println("4. Sala para niños ("+pelicula4+")");
			System.out.println("5. Salir del programa");

			System.out.println("\nSeleccione un numero");

			numeroSeleccionado = Leer.datoInt();
		
		switch (numeroSeleccionado){
		
			case 1: {
			System.out.println("La entrada cuesta "+salaVIP
					+"€ en la sala VIP");
			System.out.println("¿Cuántas entradas va a querer?");
			numeroEntradas = Leer.datoInt();
			precioVIP = numeroEntradas*salaVIP;
			System.out.printf("El coste total es de: %.2f€\n",precioVIP);
			break;
			
			}
			case 2: {
				System.out.println("La entrada cuesta "+sala3D
						+"€ en la sala 3D");
				System.out.println("¿Cuántas entradas va a querer?");
				numeroEntradas = Leer.datoInt();
				precio3D = numeroEntradas*sala3D;
				System.out.printf("El coste total es de: %.2f€\n",precio3D);
				break;
			}
			case 3: {
				System.out.println("La entrada cuesta "+salaNormal
						+"€ en la sala normal");
				System.out.println("¿Cuántas entradas va a querer?");
				numeroEntradas = Leer.datoInt();
				precioNormal = numeroEntradas*salaNormal;
				System.out.printf("El coste total es de: %.2f€\n",precioNormal);
				break;
		
			}
			case 4: {
				System.out.println("La entrada cuesta "+salaNiños
						+"€ en la sala de niños");
				System.out.println("¿Cuántas entradas va a querer?");
				numeroEntradas = Leer.datoInt();
				precioNiños = numeroEntradas*salaNiños;
				System.out.printf("El coste total es de: %.2f€\n",precioNiños);
				break;
			}
			case 5: {
					System.out.println("Saliendo...");
					break;
						
				}default:
					System.out.println("Opcion incorrecta");
					break;
		}
			} while (numeroSeleccionado!=0);
			
		}
		
		
	}