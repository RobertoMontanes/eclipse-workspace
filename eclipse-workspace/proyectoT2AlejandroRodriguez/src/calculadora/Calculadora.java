package calculadora;

import java.util.Random;
import utilidades.Leer;

/*
 * Trabajo realizado por: Roberto Montañés | Alejandro Rodriguez
 * 
 * Miércoles 30 de agosto: Ambos diseñamos la lógica del programa y definimos 
 * el tema relacionado con la gestión de trabajo, con lo que va a realizar cada uno. 
 * 
 * Jueves 31 de agosto: Hemos terminado de implementar los casos del programa, 
 * completando así el proyecto, se nos ha petado el proyecto, y ha desaparecido por completo
 * debido a un fallo en el cable de la fuente de alimentación.
 * 
 * Lunes 04 de agosto: hoy hemos recuperado la parte perdida y hemos terminado el case 3
 * 
 * Este programa simula una calculadora de propiedades, permitiendo a los usuarios 
 * comprar, alquilar o compartir viviendas de diferentes tipos. Ideal para agencias 
 * inmobiliarias que desean simular ofertas de propiedades.
 * 
 * FUNCIONALIDADES:
 * - El usuario puede elegir entre comprar, alquilar o compartir propiedades.
 * - Se ofrecen diferentes categorías de propiedades, como obras nuevas, viviendas, 
 *   terrenos y edificios para compra, así como apartamentos, casas y lofts para alquiler.
 * - El programa solicita al usuario un presupuesto mínimo y máximo, generando 
 *   precios aleatorios dentro de ese rango para las propiedades disponibles.
 * - Los usuarios pueden decidir reservar una propiedad o continuar buscando.
 * 
 * Ambos: Hemos trabajado en la idea del proyecto, ayudando a nuestro compañero
 * a resolver sus dudas y problemas. También hemos colaborado en la disposición de las v
 * ariables y los arrays.
 *
 * Roberto Montañés: He realizado la declaración de variables y arrays bidimensionales,
 *  así como el desarrollo de los casos 1 y 2.
 *
 * Alejandro Rodríguez: Se ha encargado de implementar la aleatoriedad y todo lo relacionado con el caso 3.
 *
 *
 * DESARROLLO DEL PROGRAMA
 *
 * Durante el trabajo en nuestra calculadora de propiedades, hemos realizado 
 * varias mejoras significativas. En primer lugar, hemos mejorado la forma en
 *  que organizamos la información sobre las propiedades, lo que nos ha permitido
 *   manejar los datos de manera más eficiente. 
 * 
 * También añadimos una función que genera precios de forma aleatoria, lo que hace
 *  que la experiencia de búsqueda sea más interesante y realista para los usuarios.
 * 
 * Un aspecto clave que implementamos es la posibilidad de hacer reservas de propiedades,
 *  lo que facilita a los usuarios confirmar sus elecciones de manera inmediata.
 * 
 * Sin embargo, nos encontramos con algunos obstáculos en el camino. Por ejemplo, un fallo
 *  en el cable de la fuente de alimentación provocó la pérdida temporal del proyecto. Esto
 *   fue frustrante y nos enseñó la importancia de hacer copias de seguridad regularmente.
 * 
 * A pesar de estos desafíos, estamos satisfechos con el progreso que hemos logrado. 
 * Creemos que las mejoras han hecho que el programa sea más atractivo y útil, y hemos
 *  aprendido mucho sobre la gestión de proyectos en el proceso.
 */

/*
 * Work done by: Roberto Montañés | Alejandro Rodriguez
 * 
 * Wednesday, August 30: We both designed the program logic and defined 
 * the theme related to work management, detailing what each of us will do. 
 * 
 * Thursday, August 31: We have finished implementing the cases of the program, 
 * thus completing the project, but the project crashed and disappeared completely 
 * due to a failure in the power supply cable.
 * 
 * Monday, August 4: Today we recovered the lost part and finished case 3.
 * 
 * 
 * 
 * This program simulates a property calculator, allowing users to 
 * buy, rent, or share different types of homes. It is ideal for real estate 
 * agencies that want to simulate property offers.
 * 
 * Features:
 * - Users can choose between buying, renting, or sharing properties.
 * - Different categories of properties are offered, such as new builds, homes, 
 *   land, and buildings for purchase, as well as apartments, houses, and lofts for rent.
 * - The program prompts the user for a minimum and maximum budget, generating 
 *   random prices within that range for available properties.
 * - Users can decide to reserve a property or continue searching.
 *
 * Both: We have worked on the project idea, assisting our teammate in resolving their
 *  doubts and issues. We have also collaborated on the arrangement of variables and arrays.
 *
 * Roberto Montañés: I have completed the declaration of variables and two-dimensional arrays, as well as the implementation of cases 1 and 2.
 *
 * Alejandro Rodríguez: He has taken care of implementing randomness and everything related to case 3.
 *
 *
 *
 * Comment on the development of the program
 *
 * During our work on the property calculator, we made several significant improvements.
 *  First, we enhanced the way we organized information about the properties, allowing us
 *   to manage data more efficiently.
 * 
 * We also added a feature that generates prices randomly, making the search experience 
 * more interesting and realistic for users.
 * 
 * A key aspect we implemented is the ability to make property reservations, which helps
 *  users confirm their choices immediately.
 * 
 * However, we encountered some obstacles along the way. For instance, a failure in the 
 * power supply cable led to a temporary loss of the project. This was frustrating and 
 * taught us the importance of making regular backups.
 * 
 * Despite these challenges, we are pleased with the progress we've made. We believe the 
 * improvements have made the program more appealing and useful, and we have learned a lot
 *  about project management in the process.
 */


public class Calculadora {

	public static void main(String[] args) {

		int opcion;
		int opcionTipoPropiedad;
		int presupuestoMax;
		int presupuestoMin;
		int respuesta;
		int numPropiedades;
		int[] precios;
		int segundaOpcion;

		String[][] propiedadesCompra = { { "Casa Moderna", "Piso de Lujo", "Dúplex Familiar" },
				{ "Apartamento en el Centro", "Casa de Campo", "Estudio Pequeño" },
				{ "Terreno en la Playa", "Terreno en la Montaña", "Terreno Urbano" },
				{ "Edificio de Oficinas", "Residencial de Apartamentos", "Edificio Comercial" } };

		String[][] propiedadesAlquiler = { { "Apartamento Amueblado", "Estudio en el Centro", "Casa de Verano" },
				{ "Piso Compartido", "Departamento en la Playa", "Casa de Campo" },
				{ "Loft Industrial", "Estudio Minimalista", "Casa en el Bosque" } };

		int[] arrayprecio = new int[5];
		float[] porcentajeCompartir = new float[5];
		float numeropersonas;

		Random num = new Random(System.nanoTime());

		System.out.println("Bienvenido a nuestro programa donde podrá comprar, alquilar o compartir viviendas\n");

		do {
			System.out.println("\n---------------------------");
			System.out.println("Elija una opción:");
			System.out.println("0. Salir del programa");
			System.out.println("1. Comprar una propiedad");
			System.out.println("2. Alquilar una propiedad");
			System.out.println("3. Compartir una propiedad");
			System.out.println("---------------------------");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("***********************************************************************");
				System.out.println("¿Qué tipo de propiedad desea comprar? (seleccione un número de opción):");
				System.out.println("1. Obra nueva");
				System.out.println("2. Vivienda");
				System.out.println("3. Terreno sin construir");
				System.out.println("4. Edificio");
				System.out.println("***********************************************************************");
				opcionTipoPropiedad = Leer.datoInt();

				if (opcionTipoPropiedad >= 1 && opcionTipoPropiedad <= 4) {
					System.out.println("¿Cuál es el presupuesto mínimo que se quiere gastar?");
					presupuestoMin = Leer.datoInt();
					System.out.println("¿Cuál es el presupuesto máximo que se quiere gastar?");
					presupuestoMax = Leer.datoInt();

					if (presupuestoMin >= 0 && presupuestoMax > presupuestoMin) {
						numPropiedades = propiedadesCompra[opcionTipoPropiedad - 1].length;
						precios = new int[numPropiedades];

						System.out.println("Propiedades disponibles:\n");
						for (int i = 0; i < numPropiedades; i++) {
							precios[i] = num.nextInt(presupuestoMax - presupuestoMin + 1) + presupuestoMin;
							System.out.println("Propiedad: " + propiedadesCompra[opcionTipoPropiedad - 1][i]
									+ " - Precio: " + precios[i] + "€");

							System.out.println("¿Desea reservar esta propiedad? (1. Sí / 2. No)");
							respuesta = Leer.datoInt();

							if (respuesta == 1) {
								System.out.println("¡Reserva aceptada para la propiedad: "
										+ propiedadesCompra[opcionTipoPropiedad - 1][i] + " por " + precios[i] + "€!");
								System.out.println("Gracias por su reserva.\n");
								break;
							} else if (respuesta == 2) {
								System.out.println("Continuando con la búsqueda...\n");
							} else {
								System.out.println("Opción no válida. Continuando con la búsqueda...\n");
							}
						}
					} else {
						System.out.println("Por favor, ingrese un rango de presupuesto válido.");
					}
				} else {
					System.out.println("Opción de tipo de propiedad no válida.");
				}
				System.out.println("\n(presione intro para continuar)");
				Leer.dato();
				break;
			case 2:
				System.out.println("************************************************************************");
				System.out.println("¿Qué tipo de propiedad desea alquilar? (seleccione un número de opción):");
				System.out.println("1. Apartamento");
				System.out.println("2. Casa");
				System.out.println("3. Loft");
				System.out.println("************************************************************************");
				opcionTipoPropiedad = Leer.datoInt();

				if (opcionTipoPropiedad >= 1 && opcionTipoPropiedad <= 3) {
					System.out.println("¿Cuál es el presupuesto mínimo que se quiere gastar?");
					presupuestoMin = Leer.datoInt();
					System.out.println("¿Cuál es el presupuesto máximo que se quiere gastar?");
					presupuestoMax = Leer.datoInt();

					if (presupuestoMin >= 0 && presupuestoMax > presupuestoMin) {
						numPropiedades = propiedadesAlquiler[opcionTipoPropiedad - 1].length;
						precios = new int[numPropiedades];

						System.out.println("Propiedades disponibles para alquilar:\n");
						for (int i = 0; i < numPropiedades; i++) {
							precios[i] = num.nextInt(presupuestoMax - presupuestoMin + 1) + presupuestoMin;
							System.out.println("Propiedad: " + propiedadesAlquiler[opcionTipoPropiedad - 1][i]
									+ " - Precio: " + precios[i] + "€/mes");

							System.out.println("¿Desea reservar esta propiedad? (1. Sí / 2. No)");
							respuesta = Leer.datoInt();

							if (respuesta == 1) {
								System.out.println("¡Reserva aceptada para la propiedad: "
										+ propiedadesAlquiler[opcionTipoPropiedad - 1][i] + " por " + precios[i]
										+ "€/mes!");
								System.out.println("Gracias por su reserva.\n");
								break;
							} else if (respuesta == 2) {
								System.out.println("Continuando con la búsqueda...\n");
							} else {
								System.out.println("Opción no válida. Continuando con la búsqueda...\n");
							}
						}
					} else {
						System.out.println("Por favor, ingrese un rango de presupuesto válido.");
					}
				} else {
					System.out.println("Opción de tipo de propiedad no válida.");
				}
				System.out.println("\n(presione intro para continuar)");
				Leer.dato();
				break;
			case 3:

				System.out.println("¿Cuántas personas compartirán la vivienda?");
				numeropersonas = Leer.datoInt();
				System.out.println("¿Cuál es el presupuesto mínimo que se quiere gastar?");
				presupuestoMin = Leer.datoInt();
				System.out.println("¿Cuál es el presupuesto máximo que se quiere gastar?");
				presupuestoMax = Leer.datoInt();

				if (presupuestoMin < 0 || presupuestoMax <= presupuestoMin) {
					System.out.println("Por favor, ingrese un rango de presupuesto válido.");
					continue;
				} else {
					for (int i = 0; i < arrayprecio.length; i++) {
						arrayprecio[i] = num.nextInt(presupuestoMax - presupuestoMin + 1) + presupuestoMin;
						porcentajeCompartir[i] = (arrayprecio[i] * (100 / numeropersonas)) / 100;
					}
				}
				System.out.println("************************************************************************");
				System.out.println("Propiedades compartidas:\n");
				System.out.println(propiedadesCompra[num.nextInt(3 - 1 + 1) + 1][num.nextInt(2 - 1 + 1) + 1]);
				System.out.printf("1) Coste mensual: %d€ - Tu %.0f%%: %.0f€\n", arrayprecio[0], (100 / numeropersonas),
						porcentajeCompartir[0]);
				System.out.println(propiedadesCompra[num.nextInt(3 - 1 + 1) + 1][num.nextInt(2 - 1 + 1) + 1]);
				System.out.printf("2) Coste mensual: %d€ - Tu %.0f%%: %.0f€\n", arrayprecio[1], (100 / numeropersonas),
						porcentajeCompartir[1]);
				System.out.println(propiedadesCompra[num.nextInt(3 - 1 + 1) + 1][num.nextInt(2 - 1 + 1) + 1]);
				System.out.printf("3) Coste mensual: %d€ - Tu %.0f%%: %.0f€\n", arrayprecio[2], (100 / numeropersonas),
						porcentajeCompartir[2]);
				System.out.println(propiedadesCompra[num.nextInt(3 - 1 + 1) + 1][num.nextInt(2 - 1 + 1) + 1]);
				System.out.printf("4) Coste mensual: %d€ - Tu %.0f%%: %.0f€\n", arrayprecio[3], (100 / numeropersonas),
						porcentajeCompartir[3]);
				System.out.println(propiedadesCompra[num.nextInt(3 - 1 + 1) + 1][num.nextInt(2 - 1 + 1) + 1]);
				System.out.printf("5) Precio normal: %d€ - Tu %.0f%%: %.0f€\n", arrayprecio[4], (100 / numeropersonas),
						porcentajeCompartir[4]);
				System.out.println("elija una opcion (0 para cancelar)");
				System.out.println("************************************************************************");
				segundaOpcion = Leer.datoInt();

				switch (segundaOpcion) {

				case 1: {

					System.out.println("¡Reserva aceptada!");
					System.out.println("Gracias por su tiempo");
					break;
				}

				case 2: {
					System.out.println("¡Reserva aceptada!");
					System.out.println("Gracias por su tiempo");
					break;
				}
				case 3: {
					System.out.println("¡Reserva aceptada!");
					System.out.println("Gracias por su tiempo");
					break;
				}
				case 4: {
					System.out.println("¡Reserva aceptada!");
					System.out.println("Gracias por su tiempo");
					break;
				}
				case 5: {
					System.out.println("¡Reserva aceptada!");
					System.out.println("Gracias por su tiempo");
					break;
				}
				case 0: {
					System.out.println("cancelando....");
					System.out.println("reserva cancelada");
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcion);
				}
				System.out.println("\n(presione intro para continuar)");
				Leer.dato();
				break;

			default:
				System.out.println("Opción no válida. Intente de nuevo.\n");
				break;
			}
		} while (opcion != 0);
		System.out.println("\nMuchas gracias por usar nuestro programa");
	}
}